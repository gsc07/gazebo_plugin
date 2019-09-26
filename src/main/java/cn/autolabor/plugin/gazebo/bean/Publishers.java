package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPublish;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPublishers;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.List;

public class Publishers implements ProtoBufBeanInterface {

    private List<Publisher> publishers;

    public Publishers() {
        this.publishers = new ArrayList<>();
    }

    public Publishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

    @Override
    public String toString() {
        return "Publishers{" + "publishers=" + publishers + '}';
    }

    @Override
    public ProtoBufBeanInterface decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoPublishers.Publishers parseData = ProtoPublishers.Publishers.parseFrom(bytes);
        publishers.clear();
        for (int i = 0; i < parseData.getPublisherCount(); i++) {
            publishers.add(new Publisher(parseData.getPublisher(i)));
        }
        return this;
    }

    @Override
    public ByteString encode() {
        ProtoPublishers.Publishers.Builder builder = ProtoPublishers.Publishers.newBuilder();
        publishers.forEach(n -> builder.addPublisher(ProtoPublish.Publish.newBuilder().setTopic(n.getTopic()).setMsgType(n.getMsgType()).setHost(n.getHost()).setPort(n.getPort()).build()));
        return builder.build().toByteString();
    }
}
