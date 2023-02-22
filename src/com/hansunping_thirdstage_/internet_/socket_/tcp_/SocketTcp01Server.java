package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp01Server {
    //字节流
    //服务端发送数据到客户端
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("等待Socket连接……");
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,server".getBytes());
        outputStream.close();
        accept.close();
    }
}
