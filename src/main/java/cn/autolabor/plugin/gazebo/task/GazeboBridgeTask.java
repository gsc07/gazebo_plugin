package cn.autolabor.plugin.gazebo.task;

import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskParameter;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.plugin.gazebo.bean.*;
import cn.autolabor.plugin.gazebo.conversion.ConversionInterface;
import cn.autolabor.plugin.gazebo.msgs.ProtoPacket;
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

    private Map<String, SubscriberInfo> subscriberMap = new HashMap<>(); // TOPIC Socket

    private final static GazeboBridgeTask single = ServerManager.me().register(new GazeboBridgeTask());

    public static GazeboBridgeTask me() {
        return single;
    }

    // 外部调用方法
    public void registerSubscriber(String gzTopic, String gzMsgType, String topic, TypeNode typeNode, ConversionInterface conv) {
        if (subscriberMap.containsKey(gzTopic)) {
            System.err.println(String.format("Topic %s has been registered", gzTopic));
            return;
        }
        subscriberMap.put(gzTopic, new SubscriberInfo(gzTopic, gzMsgType, topic, typeNode, conv));
        asyncRun("subscribe", gzTopic, gzMsgType);
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

    // 给 Master 发订阅信息
    @TaskFunction(name = "subscribe")
    public void subscribe(String gzTopic, String gzMsgType) {
        if (os != null) {
            Packet<Subscriber> packet = new Packet<>("subscribe", new Subscriber(gzTopic, serverHost, serverPort, gzMsgType, false));
            try {
                ParseUtil.writeData(packet.encode(), os);
            } catch (IOException e) {
                System.err.println(String.format("Subscribe %s error!", gzTopic));
                e.printStackTrace();
            }
        } else {
            asyncRunLater("subscribe", 2000L, gzTopic, gzMsgType);
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
                    case "publisher_add":
                        break;
                    case "publisher_subscribe":
                        Publisher publisher = new Publisher().decode(packet.getSerializedData());
                        if (subscriberMap.containsKey(publisher.getTopic())) {
                            SubscriberInfo subscriberInfo = subscriberMap.get(publisher.getTopic());
                            if (!subscriberInfo.getInfo().containsKey(publisher)) {
                                SubscriberDataTask task = ServerManager.me().register(new SubscriberDataTask(publisher, subscriberInfo));
                                subscriberMap.get(publisher.getTopic()).getInfo().put(publisher, task);
                            }
                        }
                        break;
                    case "unsubscribe":
                        break;
                    case "publisher_del":
                        break;
                    default:
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
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
    @TaskFunction(name = "handleClient")
    public void handleClient(Socket client) {
    }

    public static void main(String[] args) {
        ServerManager.me().register(new GazeboBridgeTask());
    }
}
