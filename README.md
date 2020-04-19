# gazebo_plugin
gazebo的通讯协议可以参考
https://www.guoshichun.com/gazebo/2019/08/30/gazebo-protocol-1/
https://www.guoshichun.com/gazebo/2019/09/01/gazebo-protocol-2/

在此demo中使用autolabor_framework机器人框架实现与gazebo模拟器通信，通过向gazebo的/marker话题发送数据，实现在gazebo仿真界面画基本图形。
本例中还包含接收gazebo的雷达数据，与向gazebo发送速度信息，控制小车行驶的功能。
