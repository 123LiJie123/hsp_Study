package com.hansunping_thirdstage_.internet_.socket_.homework_.homework01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        outputStream.write(s.getBytes());
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        int readLen;
        byte[] buff = new byte[1024];
        while ((readLen = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff, 0, readLen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
