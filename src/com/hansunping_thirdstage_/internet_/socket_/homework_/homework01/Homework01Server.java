package com.hansunping_thirdstage_.internet_.socket_.homework_.homework01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    /*
    （1）使用字符流的方式，编写一个客户端程序和服务器端程序
    （2）客户端发送"name"，服务器端接收到后，返回“我是nova”
    （3）客户端发送"hobby"，服务器端接收到后，返回“编写java程序”
    （4）不是这两个问题，回复“你说啥呢”
     */
    public static void main(String[] args) throws IOException {
        //1、在服务器端建立管道
        ServerSocket serverSocket = new ServerSocket(9999);
        //2、生成与客户端连接的管道
        Socket accept = serverSocket.accept();
        System.out.println("服务器端正在等待响应");
        //3、获取字节输入流
        InputStream inputStream = accept.getInputStream();
        int readLen;
        byte[] bytes = new byte[1024];
        String s = "";

        while ((readLen = inputStream.read(bytes)) != -1) {
            s += new String(bytes, 0, readLen);
        }

        OutputStream outputStream = accept.getOutputStream();
        if (s.equals("name")) {
            outputStream.write("nova".getBytes());
        } else if (s.equals("hobby")) {
            outputStream.write("编写java程序".getBytes());
        } else {
            outputStream.write("你说啥呢".getBytes());
        }
        accept.shutdownOutput();


        outputStream.close();
        inputStream.close();
        serverSocket.close();

    }
}
