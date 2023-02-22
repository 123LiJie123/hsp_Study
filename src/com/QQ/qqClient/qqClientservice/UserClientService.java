package com.QQ.qqClient.qqClientservice;


import com.QQ.common.Message;
import com.QQ.common.MessageType;
import com.QQ.common.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//根据userId 和 pwd到服务器验证该是否合法
public class UserClientService {

    //因为我们可能在其他地方会使用user信息，因此作成员属性
    private User user = new User();

    private Socket socket;

    private boolean aBoolean = false;
    private ObjectOutputStream objectOutputStream;

    public boolean checkUser(String userId, String pwd) throws IOException, ClassNotFoundException {
        aBoolean = true;

        //创建User对象
        user.setUserId(userId);
        user.setPasswd(pwd);
        //连接到服务器，发送user对象
        socket = new Socket(InetAddress.getByName("192.168.1.111"), 9999);
        ObjectOutputStream obj = new ObjectOutputStream(socket.getOutputStream());
        obj.writeObject(user);  //发送User对象


        //读取从服务器回复的Message对象
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Message ms = (Message) objectInputStream.readObject();  //message对象


        if (ms.getMesType().equals(MessageType.MESSSAGE_LOGIN_SUCCEED)) {   //登录ok
            //创建一个和服务端保持通信的线程->创建一个类 ClientConnectServerThread
            //这里为了后面客户端的扩展，我们将线程放入到集合管理

            ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
            ManageClientConnectServerThread.addClientConnectServerThread(userId, ccst);
            ccst.start();


        } else {
            //如果登录失败...，我们就不能启动和服务器通信的线程，关闭socket
            aBoolean = false;
            socket.close();
        }


        return aBoolean;

    }


    //向服务器端请求在线用户列表
    public void onlineFriendList(String userId) {
        //发送一个Message,类型MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        try {

            //发送给服务器
            //应该得到当前线程的Socket对应的ObjectOutputStream对象
            objectOutputStream = new ObjectOutputStream(
                    ManageClientConnectServerThread
                            .getClientConnectServerThread(userId)
                            .getSocket()
                            .getOutputStream());
            objectOutputStream.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
