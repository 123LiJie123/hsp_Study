package com.QQ.qqClient.qqClientservice;

import com.QQ.common.Message;
import com.QQ.common.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread {
    //客户端连接服务线程


    //该线程需要持有Socket
    private Socket socket;
    private ObjectInputStream objectInputStream;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    //为了更方便的得到Socket
    public Socket getSocket() {
        return socket;
    }


    //
    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，因此我们用一个While循环
        while (true) {
            try {
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                System.out.println("客户端线程，等待从读取从服务器端发送的消息");
                //如果服务器没有发送Message对象，线程会阻塞在这里
                Message msg = (Message) objectInputStream.readObject();


                //如果是该读取到的是服务端返回的在线用户列表信息
                if (msg.getMesType().equals(MessageType.MESSAGE_RET_ONLINE_FRIEND)) {
                    //取出在线用户列表
                    String[] onLineUsers = msg.getContent().split(" ");
                    System.out.println("=======当前在线用户列表=======");
                    for (int i = 0; i < onLineUsers.length; i++) {
                        System.out.println("用户：" + onLineUsers[i]);
                    }

                } else {

                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
