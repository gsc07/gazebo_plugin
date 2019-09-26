package cn.autolabor.plugin.gazebo.test;

import cn.autolabor.core.server.ServerManager;
import cn.autolabor.message.navigation.Msg2DTwist;
import cn.autolabor.message.sensor.MsgLidar;
import cn.autolabor.plugin.gazebo.conversion.LidarMsgConversion;
import cn.autolabor.plugin.gazebo.conversion.TwistMsgConversion;
import cn.autolabor.plugin.gazebo.task.GazeboBridgeTask;
import cn.autolabor.util.reflect.TypeNode;

public class GazeboCommunicateTest {

    public static void main(String[] args) {
        GazeboBridgeTask.me().registerSubscriber("/gazebo/default/pioneer2dx_withLidar/hokuyo/link/laser/scan", "gazebo.msgs.LaserScanStamped", "scan", new TypeNode(MsgLidar.class), new LidarMsgConversion());
        GazeboBridgeTask.me().registerPublisher("/gazebo/default/pioneer2dx_withLidar/vel_cmd", "gazebo.msgs.Pose", "cmd_vel", new TypeNode(Msg2DTwist.class), new TwistMsgConversion());

        ServerManager.me().register(new SubscribeLidar());
        ServerManager.me().register(new ControlCarTest());

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ServerManager.me().stop();
    }
}
