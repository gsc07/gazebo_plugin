package cn.autolabor.plugin.gazebo.task;

import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskParameter;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.plugin.gazebo.bean.ServerInfo;
import cn.autolabor.plugin.gazebo.ignitionmsgs.MarkerProtos;
import cn.autolabor.plugin.gazebo.ignitionmsgs.MaterialProtos;
import cn.autolabor.plugin.gazebo.ignitionmsgs.PoseProtos;
import cn.autolabor.plugin.gazebo.ignitionmsgs.Vector3dProtos;
import cn.autolabor.util.Sugar;
import cn.autolabor.util.autobuf.ByteBuilder;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@TaskProperties
public class GazeboMarkerServerTask extends AbstractTask {

    static {
        System.setProperty("java.net.preferIPv4Stack", "true");
    }

    @TaskParameter(name = "networkInterfaceName", value = "")
    private String networkInterfaceName;

    @TaskParameter(name = "ip", value = "224.0.0.7")
    private String ip;

    @TaskParameter(name = "port", value = "11318")
    private int port;

    @TaskParameter(name = "ttl", value = "1")
    private int ttl;

    @TaskParameter(name = "topicFilter", value = "/marker")
    private String topicFilter;

    private MulticastSocket receiveSocket;
    private Map<String, ServerInfo> markerServer = new HashMap<>();
    private ZMQ.Socket requester;
    private String requesterAddress;
    private String responseReceiverId;
    private String reqNodeUUID;


    public GazeboMarkerServerTask(String... name) {
        super(name);
        try {
            receiveSocket = new MulticastSocket(port);
            receiveSocket.setLoopbackMode(false);
            receiveSocket.setReuseAddress(true);
            receiveSocket.setTimeToLive(1);
            receiveSocket.setNetworkInterface(Sugar.tryGetNetworkInterface(networkInterfaceName));
            receiveSocket.joinGroup(InetAddress.getByName(ip));
            asyncRunWithSubTask("Receive", 5, false, "receive");

            ZContext context = new ZContext();
            this.requester = context.createSocket(SocketType.ROUTER);
            String hostAddress = receiveSocket.getInterface().getHostAddress();
            int port = requester.bindToRandomPort(String.format("tcp://%s", hostAddress));
            this.requesterAddress = String.format("tcp://%s:%d", hostAddress, port);
            this.responseReceiverId = UUID.randomUUID().toString();
            this.reqNodeUUID = UUID.randomUUID().toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @TaskFunction
    public void receive() {
        DatagramPacket packet = new DatagramPacket(new byte[1000], 1000);
        try {
            receiveSocket.receive(packet);
            ByteBuilder bb = new ByteBuilder(Arrays.copyOf(packet.getData(), packet.getLength())).resetPosition();
            int version = bb.readShort();
            String processUUID = new String(bb.readBytes(bb.readShort()));
            int messageType = bb.readByte();
            bb.readShort(); // flag
            if (messageType == 1) {
                String topic = new String(bb.readBytes(bb.readShort()));
                String zeromqAddress = new String(bb.readBytes(bb.readShort()));
                bb.readBytes(bb.readShort()); // precess uuid
                String nodeUUID = new String(bb.readBytes(bb.readShort()));
                String socketUUID = new String(bb.readBytes(bb.readShort()));
                String requestType = new String(bb.readBytes(bb.readShort()));
                String responseType = new String(bb.readBytes(bb.readShort()));

                if (topic.endsWith(topicFilter) && !markerServer.containsKey(processUUID)) {
                    markerServer.put(processUUID, new ServerInfo(version, processUUID, topic, zeromqAddress, nodeUUID, socketUUID, requestType, responseType));
                    requester.connect(zeromqAddress);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            asyncRunWithSubTask("Receive", 5, false, "receive");
        }
    }

    @TaskFunction
    public void draw() {
        markerServer.forEach((key, value) -> {
            requester.send(value.getSocketUUID(), ZMQ.SNDMORE);
            requester.send(value.getTopic(), ZMQ.SNDMORE);
            requester.send(requesterAddress, ZMQ.SNDMORE);
            requester.send(responseReceiverId, ZMQ.SNDMORE);
            requester.send(reqNodeUUID, ZMQ.SNDMORE);
            requester.send(UUID.randomUUID().toString(), ZMQ.SNDMORE);

            MarkerProtos.Marker.Builder markerbuild = MarkerProtos.Marker.newBuilder();
            markerbuild.setNs("default");
            markerbuild.setId(0);
            markerbuild.setAction(MarkerProtos.Marker.Action.ADD_MODIFY);
            markerbuild.setType(MarkerProtos.Marker.Type.SPHERE);
            markerbuild.setMaterial(MaterialProtos.Material.newBuilder().setScript(MaterialProtos.Material.Script.newBuilder().setName("Gazebo/BlueLaser")));
            markerbuild.setPose(PoseProtos.Pose.newBuilder().setPosition(Vector3dProtos.Vector3d.newBuilder().setZ(1).build()).build());
            requester.send(markerbuild.build().toByteArray(), ZMQ.SNDMORE);
            requester.send(value.getRequestType(), ZMQ.SNDMORE);
            requester.send(value.getResponseType(), 0);
            System.out.println("ok!");
        });
    }


    public static void main(String[] args) {
        ServerManager.me().register(new GazeboMarkerServerTask());
    }
}
