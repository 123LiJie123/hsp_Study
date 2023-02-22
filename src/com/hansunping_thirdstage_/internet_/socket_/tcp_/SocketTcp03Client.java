package com.hansunping_thirdstage_.internet_.socket_.tcp_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class SocketTcp03Client {
    //客户端发送消息给服务端
    //字符流
    public static void main(String[] args) throws IOException {
        char[] chars = new char[1024];
        String string;
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //通过输出流，写入数据到数据通道，使用字符流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client,字符流");
        socket.shutdownOutput();
        bufferedWriter.newLine();   //插入一个换行符，表示写入的内容结束
        bufferedWriter.flush();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
//        String s = bufferedReader.readLine();
//        System.out.println(s);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
