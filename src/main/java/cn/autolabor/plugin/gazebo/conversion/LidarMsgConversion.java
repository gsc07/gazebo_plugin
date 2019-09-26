package cn.autolabor.plugin.gazebo.conversion;

import cn.autolabor.message.sensor.MsgLidar;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoLaserscan;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoLaserscanStamped;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.List;

public class LidarMsgConversion implements ConversionInterface<MsgLidar> {
    @Override
    public MsgLidar toFramework(ByteString gazeboMsg) {
        try {
            ProtoLaserscanStamped.LaserScanStamped protoLidarMsg = ProtoLaserscanStamped.LaserScanStamped.parseFrom(gazeboMsg);
            ProtoLaserscan.LaserScan laserScan = protoLidarMsg.getScan();
            List<Double> angleList = new ArrayList<>();
            List<Double> distanceList = new ArrayList<>();
            double angle = laserScan.getAngleMin();
            for (int i = 0; i < protoLidarMsg.getScan().getCount(); i++) {
                double distance = laserScan.getRanges(i);
                if (Double.isFinite(distance)) {
                    angleList.add(angle);
                    distanceList.add(distance);
                }
                angle += laserScan.getAngleStep();
            }
            return new MsgLidar(laserScan.getFrame(), angleList, distanceList);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return new MsgLidar();
    }

    @Override
    public ByteString toGazebo(MsgLidar frameworkMsg) {
        return null;
    }
}
