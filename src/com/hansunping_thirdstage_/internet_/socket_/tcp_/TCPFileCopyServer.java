package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileCopyServer {
    //1、编写一个服务端，和一个客户端
    //2、服务器端在9999端口监听
    //3、客户端连接到服务端，发送一张图片D:\\file\\d2.png
    //4、服务器端接收到客户端发送的图片，保存到src下，发送“收到图片”再退出
    //5、客户端接收到服务端发送的“收到图片”,再退出
    //6、该程序要求使用StreamUtils.java

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[1024];
        int readLen;
        //1、获得服务器端accept Socket
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = new FileOutputStream("d:\\file\\d3.png");
        while ((readLen = inputStream.read(bytes)) != -1) {
            StreamUtils.writeByteData(outputStream, bytes);
        }


        BufferedWriter bufferedWriter = StreamUtils.getBufferedWriter(accept);
        StreamUtils.writeCharData(bufferedWriter, "收到数据");

        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
