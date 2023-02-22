package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTcp02Client {
    //字节流
    //客户端发送消息给服务端，等待服务端响应后，接收服务端发送的消息并输出
    public static void main(String[] args) throws IOException {
        byte[] buff = new byte[1024];
        int readLen = 0;
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);



        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        while ((readLen = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));
        }

        outputStream.close();
        inputStream.close();
        socket.close();

    }
}
