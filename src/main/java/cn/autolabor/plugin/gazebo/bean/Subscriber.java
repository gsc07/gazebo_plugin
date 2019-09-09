package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.msgs.ProtoSubscribe;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Objects;

public class Subscriber implements ProtoBufBeanInterface {

    private String topic;
    private String host;
    private int port;
    private String msgType;
    private boolean latching;

    public Subscriber() {
    }

    public Subscriber(String topic, String host, int port, String msgType, boolean latching) {
        this.topic = topic;
        this.host = host;
        this.port = port;
        this.msgType = msgType;
        this.latching = latching;
    }

    public Subscriber(ProtoSubscribe.Subscribe protoData) {
        this.topic = protoData.getTopic();
        this.host = protoData.getHost();
        this.port = protoData.getPort();
        this.msgType = protoData.getMsgType();
        this.latching = protoData.hasLatching() && protoData.getLatching();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public boolean isLatching() {
        return latching;
    }

    public void setLatching(boolean latching) {
        this.latching = latching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Subscriber that = (Subscriber) o;

        if (port != that.port)
            return false;
        if (latching != that.latching)
            return false;
        if (!Objects.equals(topic, that.topic))
            return false;
        if (!Objects.equals(host, that.host))
            return false;
        return Objects.equals(msgType, that.msgType);
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + port;
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (latching ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Subscriber{" + "topic='" + topic + '\'' + ", host='" + host + '\'' + ", port=" + port + ", msgType='" + msgType + '\'' + ", latching=" + latching + '}';
    }

    @Override
    public Subscriber decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoSubscribe.Subscribe parseData = ProtoSubscribe.Subscribe.parseFrom(bytes);
        this.topic = parseData.getTopic();
        this.msgType = parseData.getMsgType();
        this.host = parseData.getHost();
        this.port = parseData.getPort();
        this.latching = parseData.getLatching();
        return this;
    }

    @Override
    public ByteString encode() {
        return ProtoSubscribe.Subscribe.newBuilder().setTopic(this.topic).setMsgType(this.msgType).setHost(this.host).setPort(this.port).setLatching(this.latching).build().toByteString();
    }
}
