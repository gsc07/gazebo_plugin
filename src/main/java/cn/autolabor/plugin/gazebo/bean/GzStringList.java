package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzStringV;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.List;

public class GzStringList implements ProtoBufBeanInterface {

    private List<String> data;

    public GzStringList() {
        this.data = new ArrayList<>();
    }

    public GzStringList(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GzStringList{" + "data=" + data + '}';
    }


    @Override
    public GzStringList decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoGzStringV.GzString_V parseData = ProtoGzStringV.GzString_V.parseFrom(bytes);
        this.data.clear();
        for (int i = 0; i < parseData.getDataCount(); i++) {
            this.data.add(parseData.getData(i));
        }
        return this;
    }

    @Override
    public ByteString encode() {
        ProtoGzStringV.GzString_V.Builder builder = ProtoGzStringV.GzString_V.newBuilder();
        this.data.forEach(builder::addData);
        return builder.build().toByteString();
    }
}
