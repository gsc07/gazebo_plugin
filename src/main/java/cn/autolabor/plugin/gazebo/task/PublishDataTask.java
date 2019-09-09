package cn.autolabor.plugin.gazebo.task;

import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.core.server.message.MessageHandle;
import cn.autolabor.core.server.message.MessageSourceType;
import cn.autolabor.plugin.gazebo.bean.Subscriber;
import cn.autolabor.plugin.gazebo.conversion.ConversionInterface;
import cn.autolabor.plugin.gazebo.util.ParseUtil;
import cn.autolabor.util.reflect.TypeNode;
import com.google.protobuf.ByteString;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

@TaskProperties(unique = false, preemptive = true)
public class PublishDataTask extends AbstractTask {

    private ConversionInterface conv;
    private MessageHandle messageHandle;
    private Map<Subscriber, Socket> subscribeInfo = new HashMap<>();

    public PublishDataTask(String topic, TypeNode typeNode, ConversionInterface conv, String... name) {
        super(name);
        this.conv = conv;
        messageHandle = ServerManager.me().getOrCreateMessageHandle(topic, typeNode);
        messageHandle.addCallback(this, "publishData", new MessageSourceType[]{});
    }

    @SuppressWarnings("unchecked")
    @TaskFunction(name = "publishData")
    public void publishData(Object msg) {
        subscribeInfo.values().forEach(s -> {
            ByteString bs = conv.toGazebo(msg);
            try {
                ParseUtil.writeData(bs, s.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void connect(Subscriber subscriber, Socket socket) {
        if (!subscribeInfo.containsKey(subscriber)) {
            subscribeInfo.put(subscriber, socket);
        }
    }

    public void unConnect(Subscriber subscriber) {
        if (subscribeInfo.containsKey(subscriber)) {
            Socket socket = subscribeInfo.get(subscriber);
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            subscribeInfo.remove(subscriber);
        }
    }

    public void remove() {
        suspend = true;
        messageHandle.removeCallbackByTask(this);
        subscribeInfo.values().forEach(s -> {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
