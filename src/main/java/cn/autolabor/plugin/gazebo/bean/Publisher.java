package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPublish;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.Objects;

public class Publisher implements ProtoBufBeanInterface {

    private String topic;
    private String msgType;
    private String host;
    private int port;

    public Publisher() {
    }

    public Publisher(ProtoPublish.Publish data) {
        this.topic = data.getTopic();
        this.msgType = data.hasMsgType() ? data.getMsgType() : "";
        this.host = data.hasHost() ? data.getHost() : "127.0.0.1";
        this.port = data.hasPort() ? data.getPort() : 0;
    }

    public Publisher(String topic, String msgType, String host, int port) {
        this.topic = topic;
        this.msgType = msgType;
        this.host = host;
        this.port = port;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Publisher publisher = (Publisher) o;

        if (port != publisher.port)
            return false;
        if (!Objects.equals(topic, publisher.topic))
            return false;
        if (!Objects.equals(msgType, publisher.msgType))
            return false;
        return Objects.equals(host, publisher.host);
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (msgType != null ? msgType.hashCode() : 0);
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + port;
        return result;
    }

    @Override
    public String toString() {
        return "Publish{" + "topic='" + topic + '\'' + ", msgType='" + msgType + '\'' + ", host='" + host + '\'' + ", port=" + port + '}';
    }

    @Override
    public Publisher decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoPublish.Publish parseData = ProtoPublish.Publish.parseFrom(bytes);
        this.topic = parseData.getTopic();
        this.msgType = parseData.getMsgType();
        this.host = parseData.getHost();
        this.port = parseData.getPort();
        return this;
    }

    @Override
    public ByteString encode() {
        return ProtoPublish.Publish.newBuilder().setTopic(this.topic).setMsgType(this.msgType).setHost(this.host).setPort(this.port).build().toByteString();
    }
}
