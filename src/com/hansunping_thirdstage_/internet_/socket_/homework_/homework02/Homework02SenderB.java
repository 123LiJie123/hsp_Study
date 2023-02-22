package com.hansunping_thirdstage_.internet_.socket_.homework_.homework02;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        String s = "";
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        DatagramPacket packet =
                new DatagramPacket(s.getBytes(), s.getBytes().length, InetAddress.getByName("172.20.10.2"), 9999);

        socket.send(packet);


        socket.close();
    }
}
