package com.hansunping_thirdstage_.internet_.socket_.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSenderB {

    private static DatagramSocket socket;
    private static DatagramPacket packet;

    public static void main(String[] args) throws IOException {

        //创建DatagramSocket对象，准备发送和在9998端口接收数据

        socket = new DatagramSocket(9998);

        //2、将需要发送的数据，封装到DatagramPacket对象
        byte[] data = "hello 明天吃火㶽".getBytes();
        // 说明：封装的DatagramPacket对象 data内容字节数组， data.length ,主机对象,端口
        UDPSenderB.packet = new DatagramPacket(data, data.length, InetAddress.getByName("172.20.10.2"), 9999);
        DatagramPacket packet =
                UDPSenderB.packet;

        socket.send(packet);

        byte[] buf = new byte[1024];
//        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        //接收从A端回复的信息
        socket.receive(packet);

        int lenght = packet.getLength();
        byte[] bytes = packet.getData();
        System.out.println(new String(bytes, 0, lenght));
        //关闭资源
        socket.close();
        System.out.println("B端退出……");


    }


}
