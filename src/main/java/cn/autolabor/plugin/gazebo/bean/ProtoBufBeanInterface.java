package cn.autolabor.plugin.gazebo.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public interface ProtoBufBeanInterface {

    ProtoBufBeanInterface decode(ByteString bytes) throws InvalidProtocolBufferException;

    ByteString encode();

}
