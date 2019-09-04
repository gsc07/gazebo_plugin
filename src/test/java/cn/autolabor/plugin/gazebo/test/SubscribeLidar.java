package cn.autolabor.plugin.gazebo.test;

import cn.autolabor.core.annotation.SubscribeMessage;
import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.message.sensor.MsgLidar;
import cn.autolabor.plugin.gazebo.conversion.LidarMsgConversion;
import cn.autolabor.plugin.gazebo.task.GazeboBridgeTask;
import cn.autolabor.util.reflect.TypeNode;

@TaskProperties
public class SubscribeLidar extends AbstractTask {

    public SubscribeLidar(String... name) {
        super(name);
    }

    @SubscribeMessage(topic = "scan")
    @TaskFunction
    public void printLidar(MsgLidar msgLidar) {
        System.out.println(msgLidar);
    }

    public static void main(String[] args) {
        GazeboBridgeTask.me().registerSubscriber("/gazebo/default/hokuyo/link/laser/scan", "gazebo.msgs.LaserScanStamped", "scan", new TypeNode(MsgLidar.class), new LidarMsgConversion());
        ServerManager.me().register(new SubscribeLidar());
    }
}
