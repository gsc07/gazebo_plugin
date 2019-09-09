package cn.autolabor.plugin.gazebo.test;

import cn.autolabor.core.annotation.InjectMessage;
import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.core.server.message.MessageHandle;
import cn.autolabor.message.navigation.Msg2DTwist;
import cn.autolabor.plugin.gazebo.conversion.TwistMsgConversion;
import cn.autolabor.plugin.gazebo.task.GazeboBridgeTask;
import cn.autolabor.util.reflect.TypeNode;

@TaskProperties
public class ControlCarTest extends AbstractTask {

    @InjectMessage(topic = "cmd_vel")
    MessageHandle<Msg2DTwist> twistHandle;

    public ControlCarTest(String... name) {
        super(name);
        asyncRun("driver");
    }

    @TaskFunction(name = "driver")
    public void driver() {
        twistHandle.pushSubData(new Msg2DTwist(1.0, 0, 1.0));
        asyncRunLater("driver", 100L);
    }

    public static void main(String[] args) {
        GazeboBridgeTask.me().registerPublisher("/gazebo/default/pioneer2dx_withLidar/vel_cmd", "gazebo.msgs.Pose", "cmd_vel", new TypeNode(Msg2DTwist.class), new TwistMsgConversion());
        ServerManager.me().register(new ControlCarTest());
    }


}
