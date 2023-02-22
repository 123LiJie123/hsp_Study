package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp02Server {
    //字节流
    //服务端接收到客户端消息后输出后，并再返回消息给客户端
    public static void main(String[] args) throws IOException {
        byte[] buff = new byte[1024];
        int readLen = 0;
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();


        while ((readLen = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,server".getBytes());
        accept.shutdownOutput();
        inputStream.close();
        accept.close();
        outputStream.close();

    }
}
