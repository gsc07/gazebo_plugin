package cn.autolabor.plugin.gazebo.test;

import cn.autolabor.core.annotation.InjectMessage;
import cn.autolabor.core.annotation.TaskFunction;
import cn.autolabor.core.annotation.TaskProperties;
import cn.autolabor.core.server.ServerManager;
import cn.autolabor.core.server.executor.AbstractTask;
import cn.autolabor.core.server.message.MessageHandle;
import cn.autolabor.core.server.message.MessageSourceType;
import cn.autolabor.message.common.MsgHeader;

@TaskProperties
public class SubTaskTest extends AbstractTask {

    @InjectMessage(topic = "message")
    private MessageHandle<MsgHeader> messageHandle;

    public SubTaskTest(String... name) {
        super(name);
        messageHandle.addCallback(this, "printData", new MessageSourceType[]{});
        asyncRun("loop");
        asyncRunWithSubTask("subTask", 5, true, "waitLoop");
    }

    @TaskFunction
    public void loop() {
        //        System.out.println(String.format("Loop : %d", System.currentTimeMillis()));
        messageHandle.pushSubData(new MsgHeader());
        asyncRunLater("loop", 100L);
    }

    @TaskFunction
    public void printData(Object msg) {
        System.out.println(msg);
    }

    @TaskFunction
    public void waitLoop() {
        System.out.println(String.format("WaitLoop : %d", System.currentTimeMillis()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        asyncRunWithSubTask("subTask", 5, true, "waitLoop");
    }

    public static void main(String[] args) {
        ServerManager.me().register(new SubTaskTest());
    }
}
