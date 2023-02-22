package com.hansunping_thirdstage_.internet_.socket_.tcp_;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileCopyClient {
    public static void main(String[] args) throws IOException {
        //3、客户端连接到服务端，发送一张图片D:\\file\\d2.png
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream("D:\\file\\d2.png");
        byte[] bytes;
        while ((bytes = StreamUtils.readByteData(fileInputStream)) != null) {
            StreamUtils.writeByteData(outputStream, bytes);
        }
        socket.shutdownOutput();

        BufferedReader bufferedReader = StreamUtils.getBufferedReader(socket);
        StreamUtils.readCharData(bufferedReader);

        bufferedReader.close();
        outputStream.close();
        socket.close();

    }
}
