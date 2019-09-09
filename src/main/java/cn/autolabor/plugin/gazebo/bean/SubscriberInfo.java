package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.conversion.ConversionInterface;
import cn.autolabor.plugin.gazebo.task.SubscribeDataTask;
import cn.autolabor.util.reflect.TypeNode;

import java.util.HashMap;
import java.util.Map;

public class SubscriberInfo {

    private String gzTopic;
    private String gzMsgType;
    private String topic;
    private TypeNode typeNode;
    private Map<Publisher, SubscribeDataTask> info = new HashMap<>();
    private ConversionInterface conv;

    public SubscriberInfo(String gzTopic, String gzMsgType, String topic, TypeNode typeNode, ConversionInterface conv) {
        this.gzTopic = gzTopic;
        this.gzMsgType = gzMsgType;
        this.topic = topic;
        this.typeNode = typeNode;
        this.conv = conv;
    }

    public String getGzTopic() {
        return gzTopic;
    }

    public void setGzTopic(String gzTopic) {
        this.gzTopic = gzTopic;
    }

    public String getGzMsgType() {
        return gzMsgType;
    }

    public void setGzMsgType(String gzMsgType) {
        this.gzMsgType = gzMsgType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public TypeNode getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(TypeNode typeNode) {
        this.typeNode = typeNode;
    }

    public Map<Publisher, SubscribeDataTask> getInfo() {
        return info;
    }

    public void setInfo(Map<Publisher, SubscribeDataTask> info) {
        this.info = info;
    }

    public ConversionInterface getConv() {
        return conv;
    }

    public void setConv(ConversionInterface conv) {
        this.conv = conv;
    }

    @Override
    public String toString() {
        return "SubscriberInfo{" + "gzTopic='" + gzTopic + '\'' + ", gzMsgType='" + gzMsgType + '\'' + ", topic='" + topic + '\'' + ", typeNode=" + typeNode + ", info=" + info + ", conv=" + conv + '}';
    }
}
