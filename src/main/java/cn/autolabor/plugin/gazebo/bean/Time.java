package cn.autolabor.plugin.gazebo.bean;

import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public class Time implements ProtoBufBeanInterface {

    private int sec;
    private int nsec;

    public Time() {
        long ms = System.currentTimeMillis();
        this.sec = (int) (ms / 1000);
        this.nsec = (int) ((ms % 1000) * 1e6);
    }

    public Time(int sec, int nsec) {
        this.sec = sec;
        this.nsec = nsec;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getNsec() {
        return nsec;
    }

    public void setNsec(int nsec) {
        this.nsec = nsec;
    }

    @Override
    public String toString() {
        return "Time{" + "sec=" + sec + ", nsec=" + nsec + '}';
    }

    @Override
    public Time decode(ByteString bytes) throws InvalidProtocolBufferException {
        ProtoTime.Time parseTime = ProtoTime.Time.parseFrom(bytes);
        this.sec = parseTime.getSec();
        this.nsec = parseTime.getNsec();
        return this;
    }

    @Override
    public ByteString encode() {
        return ProtoTime.Time.newBuilder().setSec(this.sec).setNsec(this.nsec).build().toByteString();
    }
}
