package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.msgs.ProtoGzString;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public class GzString implements ProtoBufBeanInterface {

    private String data;

    public GzString(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GzString{" + "data='" + data + '\'' + '}';
    }

    @Override
    public GzString decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoGzString.GzString parseString = ProtoGzString.GzString.parseFrom(bytes);
        this.data = parseString.getData();
        return this;
    }

    @Override
    public ByteString encode() {
        return ProtoGzString.GzString.newBuilder().setData(this.data).build().toByteString();
    }

}
