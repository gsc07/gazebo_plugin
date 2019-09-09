package cn.autolabor.plugin.gazebo.task;

import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.core.server.message.MessageHandle;
import cn.autolabor.plugin.gazebo.bean.Packet;
import cn.autolabor.plugin.gazebo.bean.Publisher;
import cn.autolabor.plugin.gazebo.bean.Subscriber;
import cn.autolabor.plugin.gazebo.bean.SubscriberInfo;
import cn.autolabor.plugin.gazebo.util.ParseUtil;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@TaskProperties(unique = false, preemptive = true)
public class SubscribeDataTask extends AbstractTask {

    private MessageHandle messageHandle;
    private Publisher publisher;
    private SubscriberInfo subscriberInfo;
    private Socket socket;
    private InputStream is;
    private OutputStream os;

    public SubscribeDataTask(Publisher publisherInfo, SubscriberInfo subscriberInfo, String... name) {
        super(name);
        this.publisher = publisherInfo;
        this.subscriberInfo = subscriberInfo;
        asyncRun("sendSubscribeMessage");
    }

    @TaskFunction(name = "sendSubscribeMessage")
    public void sendSubscribeMessage() {
        try {
            socket = new Socket(publisher.getHost(), publisher.getPort());
            this.is = socket.getInputStream();
            this.os = socket.getOutputStream();
            Packet<Subscriber> subMsg = new Packet<>("sub", new Subscriber(publisher.getTopic(), publisher.getHost(), publisher.getPort(), publisher.getMsgType(), false));
            ParseUtil.writeData(subMsg.encode(), os);
            messageHandle = ServerManager.me().getOrCreateMessageHandle(subscriberInfo.getTopic(), subscriberInfo.getTypeNode());
            asyncRun("receiveData");
        } catch (IOException e) {
            asyncRunLater("sendSubscribeMessage", 2000L);
            e.printStackTrace();
        }
    }

    @TaskFunction(name = "receiveData")
    public void receiveData() {
        try {
            ByteString byteString = ParseUtil.readData(is);
            messageHandle.pushSubData(subscriberInfo.getConv().toFramework(byteString));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            asyncRun("receiveData");
        }
    }

    public void remove() {
        this.suspend = true;
        try {
            if (socket != null) {
                is.close();
                os.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
