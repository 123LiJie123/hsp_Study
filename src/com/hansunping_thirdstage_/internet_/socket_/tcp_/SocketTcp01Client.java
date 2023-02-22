package com.hansunping_thirdstage_.internet_.socket_.tcp_;


import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;


public class SocketTcp01Client {
    //字节流
    //客户端接收服务端发送的信息
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        Socket socket1 = new Socket(InetAddress.getLocalHost(), 9999);
        InputStream inputStream = socket.getInputStream();
        byte[] ints = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(ints)) != -1) {
            System.out.println(new String(ints, 0, len));
        }

        inputStream.close();
        socket.close();
    }
}
