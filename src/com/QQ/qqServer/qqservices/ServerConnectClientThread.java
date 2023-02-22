package com.QQ.qqServer.qqservices;

import com.QQ.common.Message;
import com.QQ.common.MessageType;
import com.QQ.qqClient.qqClientservice.ManageClientConnectServerThread;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnectClientThread extends Thread {
    //该类的一个对象和某个客户端保持通信

    private Socket socket;
    private String userId;  //连接到服务端的用户id
    private ObjectInputStream ois;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream1;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {  //这里线处于run状态，可以发送/接收消息
        while (true) {
            System.out.println("服务端和客户端保持通信，读取数据");
            try {
                ois = new ObjectInputStream(socket.getInputStream());

                Message mes
                        = (Message) ois.readObject();


                objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message msg = (Message) objectInputStream.readObject();
                if (msg.getMesType().equals(Message.MESSAGE_GET_ONLINE_FRIEND)) {
                    Message message = new Message();
                    message.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    String idStrings = ManageServerConnectClientThread.getUserId();
                    message.setContent(idStrings);
                    objectOutputStream1 = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream1.writeObject(message);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }



        }
    }
}
