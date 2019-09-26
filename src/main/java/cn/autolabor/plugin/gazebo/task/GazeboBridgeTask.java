package cn.autolabor.plugin.gazebo.task;

import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskParameter;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.plugin.gazebo.bean.*;
import cn.autolabor.plugin.gazebo.conversion.ConversionInterface;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket;
import cn.autolabor.plugin.gazebo.util.ParseUtil;
import cn.autolabor.util.reflect.TypeNode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

@TaskProperties
public class GazeboBridgeTask extends AbstractTask {

    @TaskParameter(name = "masterHost", value = "127.0.0.1")
    private String masterHost;
    @TaskParameter(name = "masterPort", value = "11345")
    private int masterPort;

    private ServerSocket nodeServer;
    private String serverHost;
    private int serverPort;

    private Socket masterSocket;
    private InputStream is;
    private OutputStream os;

    private Map<String, SubscriberInfo> subscriberMap = new HashMap<>();
    private Map<String, PublishDataTask> publisherMap = new HashMap<>();

    private final static GazeboBridgeTask single = ServerManager.me().register(new GazeboBridgeTask());

    public static GazeboBridgeTask me() {
        return single;
    }

    // 外部调用方法 注册订阅
    public void registerSubscriber(String gzTopic, String gzMsgType, String topic, TypeNode typeNode, ConversionInterface conv) {
        if (subscriberMap.containsKey(gzTopic)) {
            System.err.println(String.format("Topic %s has been registered", gzTopic));
            return;
        }
        subscriberMap.put(gzTopic, new SubscriberInfo(gzTopic, gzMsgType, topic, typeNode, conv));
        asyncRun("masterSend", "subscribe", new Subscriber(gzTopic, serverHost, serverPort, gzMsgType, false), true);
    }

    // 外部调用方法 注销订阅
    public void unRegisterSubscriber(String gzTopic) {
        if (!subscriberMap.containsKey(gzTopic)) {
            System.err.println(String.format("Topic %s has not been registered", gzTopic));
            return;
        }
        SubscriberInfo subscriberInfo = subscriberMap.get(gzTopic);
        subscriberInfo.getInfo().values().forEach(SubscribeDataTask::remove);
        subscriberMap.remove(gzTopic);
        asyncRun("masterSend", "unsubscribe", new Subscriber(gzTopic, serverHost, serverPort, "", false), false);
    }

    // 外部调用方法 注册发布
    public void registerPublisher(String gzTopic, String gzMsgType, String topic, TypeNode typeNode, ConversionInterface conv) {
        if (publisherMap.containsKey(gzTopic)) {
            System.err.println(String.format("Topic %s has been advertised", gzTopic));
            return;
        }
        publisherMap.put(gzTopic, ServerManager.me().register(new PublishDataTask(topic, typeNode, conv)));
        asyncRun("masterSend", "advertise", new Publisher(gzTopic, gzMsgType, serverHost, serverPort), true);
    }


    private GazeboBridgeTask(String... name) {
        super(name);
        asyncRun("init");
    }

    @TaskFunction(name = "init")
    public void init() {
        try {
            nodeServer = new ServerSocket(0);
            this.serverHost = nodeServer.getInetAddress().getHostAddress();
            this.serverPort = nodeServer.getLocalPort();
            asyncRunWithSubTask("ListenServerTask", 5, true, "serverListener");
            asyncRun("startMaster");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @TaskFunction(name = "masterSend")
    public void masterSend(String type, ProtoBufBeanInterface data, boolean repeat) {
        if (os != null) {
            Packet packet = new Packet<>(type, data);
            try {
                ParseUtil.writeData(packet.encode(), os);
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (repeat) {
            asyncRunLater("masterSend", 2000L, type, data, true);
        }
    }

    @TaskFunction(name = "startMaster")
    public void startMaster() {
        try {
            masterSocket = new Socket(masterHost, masterPort);
            this.is = masterSocket.getInputStream();
            this.os = masterSocket.getOutputStream();
            asyncRun("readInitInfo");
        } catch (IOException e) {
            System.err.println("StartMaster Error, Try to reconnect after 5 seconds...");
            asyncRunLater("startMaster", 5000L);
        }
    }

    @SuppressWarnings("unchecked")
    @TaskFunction(name = "readInitInfo")
    public void readInitInfo() {
        try {
            Packet<GzString> initData = new Packet<>(new GzString("")).decode(ParseUtil.readData(this.is));
            System.out.println(initData);
            Packet<GzStringList> namespaceData = new Packet<>(new GzStringList()).decode(ParseUtil.readData(this.is));
            System.out.println(namespaceData);
            Packet<Publishers> publisherData = new Packet<>(new Publishers()).decode(ParseUtil.readData(this.is));
            System.out.println(publisherData);
            asyncRunWithSubTask("ListenMasterTask", 5, true, "masterListener");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @TaskFunction(name = "masterListener")
    public void masterListener() {
        while (true) {
            try {
                ProtoPacket.Packet packet = ProtoPacket.Packet.parseFrom(ParseUtil.readData(is));
                switch (packet.getType()) {
                    case "publisher_subscribe": // master 发现有发布者，将发布者推送给订阅者
                        Publisher publisher = new Publisher().decode(packet.getSerializedData());
                        if (subscriberMap.containsKey(publisher.getTopic())) {
                            SubscriberInfo subscriberInfo = subscriberMap.get(publisher.getTopic());
                            if (!subscriberInfo.getInfo().containsKey(publisher)) {
                                SubscribeDataTask task = ServerManager.me().register(new SubscribeDataTask(publisher, subscriberInfo));
                                subscriberMap.get(publisher.getTopic()).getInfo().put(publisher, task);
                            }
                        }
                        break;
                    case "unsubscribe": // 远端订阅取消
                        Subscriber subscriber = new Subscriber().decode(packet.getSerializedData());
                        if (publisherMap.containsKey(subscriber.getTopic())) {
                            publisherMap.get(subscriber.getTopic()).unConnect(subscriber);
                        }
                        break;
                    case "publisher_del": // 远端发布话题关闭
                        Publisher publisherDel = new Publisher().decode(packet.getSerializedData());
                        if (subscriberMap.containsKey(publisherDel.getTopic())) {
                            if (subscriberMap.get(publisherDel.getTopic()).getInfo().containsKey(publisherDel)) {
                                subscriberMap.get(publisherDel.getTopic()).getInfo().get(publisherDel).remove();
                                subscriberMap.get(publisherDel.getTopic()).getInfo().remove(publisherDel);
                            }
                        }
                        break;
                    default:
                        System.err.println(String.format("Unhandle ->\n%s\n", packet.toString()));
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    // 其他客户端和该节点通信
    @TaskFunction(name = "serverListener")
    public void serverListener() {
        while (true) {
            try {
                Socket client = nodeServer.accept();
                asyncRunWithSubTask("HandleClientTask", "handleClient", client);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // node server主要用于处理其他客户端的订阅
    @SuppressWarnings("unchecked")
    @TaskFunction(name = "handleClient")
    public void handleClient(Socket client) {
        try {
            Packet<Subscriber> packet = new Packet<>(new Subscriber()).decode(ParseUtil.readData(client.getInputStream()));
            if (packet.getType().equals("sub")) {
                if (publisherMap.containsKey(packet.getData().getTopic())) {
                    publisherMap.get(packet.getData().getTopic()).connect(packet.getData(), client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ServerManager.me().register(new GazeboBridgeTask());
    }
}
