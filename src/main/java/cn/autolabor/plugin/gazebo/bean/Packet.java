package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.msgs.ProtoPacket;
import cn.autolabor.plugin.gazebo.msgs.ProtoTime;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

@SuppressWarnings("ALL")
public class Packet<T extends ProtoBufBeanInterface> implements ProtoBufBeanInterface {

    private Time time;
    private String type;
    private T data;

    public Packet() {
    }

    public Packet(T data) {
        this.data = data;
    }

    public Packet(String type, T data) {
        this.time = new Time();
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Packet{" + "type='" + type + '\'' + ", data=" + data + '}';
    }

    @Override
    public Packet decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoPacket.Packet parsePacket = ProtoPacket.Packet.parseFrom(bytes);
        this.time = new Time(parsePacket.getStamp().getSec(), parsePacket.getStamp().getNsec());
        this.type = parsePacket.getType();
        this.data.decode(parsePacket.getSerializedData());
        return this;
    }

    @Override
    public ByteString encode() {
        ProtoPacket.Packet pack = ProtoPacket.Packet.newBuilder().setStamp(ProtoTime.Time.newBuilder().setSec(this.time.getSec()).setNsec(this.time.getNsec()).build()).setType(this.type).setSerializedData(data.encode()).build();
        return pack.toByteString();
    }
}
