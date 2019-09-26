package cn.autolabor.plugin.gazebo.conversion;

import cn.autolabor.message.common.Quaternion;
import cn.autolabor.message.navigation.Msg2DTwist;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoQuaternion;
import cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d;
import com.google.protobuf.ByteString;

import static java.lang.Math.*;

public class TwistMsgConversion implements ConversionInterface<Msg2DTwist> {

    @Override
    public Msg2DTwist toFramework(ByteString gazeboMsg) {
        return null;
    }

    @Override
    public ByteString toGazebo(Msg2DTwist twist) {
        Quaternion q = eulerToQuaternion(0, 0, twist.getYaw());
        System.out.println(q);
        ProtoPose.Pose cmd = ProtoPose.Pose.newBuilder().setPosition(ProtoVector3d.Vector3d.newBuilder().setX(twist.getX()).setY(0).setZ(0).build()).setOrientation(ProtoQuaternion.Quaternion.newBuilder().setX(q.getX()).setY(q.getY()).setZ(q.getZ()).setW(q.getW()).build()).build();
        return cmd.toByteString();
    }

    private static Quaternion eulerToQuaternion(double roll, double pitch, double yaw) {
        double phi, the, psi;
        double x, y, z, w;
        double norm;

        phi = roll / 2.0;
        the = pitch / 2.0;
        psi = yaw / 2.0;

        x = sin(phi) * cos(the) * cos(psi) - cos(phi) * sin(the) * sin(psi);
        y = cos(phi) * sin(the) * cos(psi) + sin(phi) * cos(the) * sin(psi);
        z = cos(phi) * cos(the) * sin(psi) - sin(phi) * sin(the) * cos(psi);
        w = cos(phi) * cos(the) * cos(psi) + sin(phi) * sin(the) * sin(psi);

        norm = sqrt(x * x + y * y + z * z + w * w);

        if (norm == 0) {
            return new Quaternion(0, 0, 0, 1);
        } else {
            return new Quaternion(x / norm, y / norm, z / norm, w / norm);
        }
    }
}
