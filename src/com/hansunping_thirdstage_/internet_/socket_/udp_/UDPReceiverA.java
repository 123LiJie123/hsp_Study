package com.hansunping_thirdstage_.internet_.socket_.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {

    private static DatagramSocket socket;

    /*
             1、编写一个接收端A，和一个发送端B
             2、接收端A在9999端口等待接收数据(receive)
             3、发送端A向接收端B发送数据“hello,明天吃火锅~”
             4、接收端B接收到发送端A发送的数据，回复“好的，明天见”，再退出
             5、发送端接收回复的数据，再退出
              */
    public static void main(String[] args) {
        //1、创建一个DatagramSocket对象，准备在9999端口接收数据
        try {
            socket = new DatagramSocket(9999);

            //2、构建一个DatagramPacket对象，准备接收数据
            byte[] buf = new byte[1024];
            //每个数据包最大是64K
            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            //3、调用接收方法，将通过网络传输的DatagramPacket对象 填充到Packet对象
            //提示：当有数据包发送到本机的9999端口时，就会接收到数据
            //如果没有数据包发送到本机的9999端口，就会阻塞等待。

            System.out.println("接收端A 等待接收数据..");
            socket.receive(packet);


            //4、可以把packet进行拆包，取出数据，并显示。
            int length = packet.getLength(); //实际接收到的数据字节长度
            byte[] data = packet.getData();  //接收到的实际数据

            String s = new String(data, 0, length);
            System.out.println(s);


            packet.setData("好的,明天见".getBytes());
            packet.setPort(9998);
            socket.send(packet);

        } catch (IOException e) {
            e.printStackTrace();
        }


        //5、关闭资源
        socket.close();

        System.out.println("A端退出……");
    }
}
