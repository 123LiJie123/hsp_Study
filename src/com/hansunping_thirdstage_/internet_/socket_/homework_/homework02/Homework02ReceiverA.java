package com.hansunping_thirdstage_.internet_.socket_.homework_.homework02;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Homework02ReceiverA {
    /*
    （1）编写一个接收端A，和一个发送端B，使用UDP协议完成
    （2）接收端在8888端口等待接收数据(receive)
    （3）发送端向接收端发送数据“四大名著是哪些”
    （4）接收端接收到 发送端发送的问题后，返回四大名著……，否则返回what?
    （5）接收端和发送端程序退出
     */

    public static void main(String[] args) throws IOException {
        DatagramSocket socket =
                new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket packet =
                new DatagramPacket(bytes, bytes.length);

        socket.receive(packet);


        int length = packet.getLength();
        byte[] data = packet.getData();
        String string = new String(data, 0, length);
        if (string.equals("四大名著是哪些")) {
            //返回“四大名著书名”
            System.out.println("《红楼梦》……");
        } else {
            //返回“what”
            System.out.println("what");
        }

        socket.close();
    }
}
