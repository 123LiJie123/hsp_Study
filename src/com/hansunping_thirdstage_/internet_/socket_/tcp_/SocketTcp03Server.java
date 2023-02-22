package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp03Server {
    //客户端接收到服务端消息后，输出消息
    //字符流
    public static void main(String[] args) throws IOException {
        char[] chars = new char[1024];
        String string;
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("正在等待响应……");
        InputStream inputStream = accept.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
//        String s = bufferedReader.readLine();
//        System.out.println(s);

        //回复内容
        OutputStream outputStream = accept.getOutputStream();
        //使用字符串的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,Server,字符流");
        accept.shutdownOutput();
        bufferedWriter.newLine();

        bufferedWriter.flush();


        bufferedWriter.close();

        bufferedReader.close();
        serverSocket.close();

    }
}
