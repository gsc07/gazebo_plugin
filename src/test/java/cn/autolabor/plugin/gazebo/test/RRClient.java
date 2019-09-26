package cn.autolabor.plugin.gazebo.test;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

public class RRClient {
    public static void main(String[] args) {
        try (ZContext context = new ZContext()) {
            //  Socket to talk to server
            ZMQ.Socket requester = context.createSocket(SocketType.REQ);
            requester.connect("tcp://localhost:5559");

            System.out.println("launch and connect client.");

            for (int request_nbr = 0; request_nbr < 10; request_nbr++) {
                requester.send("Hello", 0);
                String reply = requester.recvStr(0);
                System.out.println("Received reply " + request_nbr + " [" + reply + "]");
            }
        }
    }
}
