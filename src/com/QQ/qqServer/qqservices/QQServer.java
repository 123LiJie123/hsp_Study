package com.QQ.qqServer.qqservices;


import com.QQ.common.Message;
import com.QQ.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class QQServer {
    //这是服务端，在监听9999端口，等待客户端的连接，并保持通信
    private ServerSocket ssk = null;
    private Socket socketaccept;
    private ObjectOutputStream objectOutputStream;

    //创建一个集合，存放多个用户，如果是这些用户登录 ，就认为是合法

    private static ConcurrentHashMap<String, User> validUser = new ConcurrentHashMap<>();

    //这里我们也可以使用ConcurrentHashMap,可以处理并发的集合，没有线程安全问题
    static {
        validUser.put("100", new User("100", "123456"));
        validUser.put("200", new User("200", "123456"));
        validUser.put("300", new User("300", "123456"));
        validUser.put("至尊宝", new User("至尊宝", "123456"));
        validUser.put("紫霞仙子", new User("紫霞仙子", "123456"));
        validUser.put("菩提老祖", new User("菩提老祖", "123456"));
    }


    //登录验证方法
    private static boolean checkUser(String userId, String pwd) {
        boolean ab = false;
        User user = validUser.get(userId);
        if (user == null) {   //说明userId没有存在于validUsers的key

        } else {
            if (user.getPasswd().equals(pwd)) {
                ab = true;
            }
        }

        return ab;
    }


    public QQServer() {
        System.out.println("服务端在9999端口监听...");

        try {
            ssk = new ServerSocket(9999);
            while (true) {
                //创建一个Message对象,准备回复客户端
                Message message = new Message();

                socketaccept = ssk.accept();   //如果没有客户端连接，就会阻塞在这里
                ObjectInputStream objectInputStream
                        = new ObjectInputStream(socketaccept.getInputStream());
                User u
                        = (User) objectInputStream.readObject();





                if (checkUser(u.getUserId(), u.getPasswd())) { //如果合法
                    objectOutputStream
                            = new ObjectOutputStream(socketaccept.getOutputStream());
                    //登录成功
                    message.setMesType(Message.MESSSAGE_LOGIN_SUCCEED);
                    objectOutputStream.writeObject(message);
                    //创建一个线程，和客户端保持通信，该线程需要持有socket对象
                    ServerConnectClientThread scct = new ServerConnectClientThread(socketaccept, u.getUserId());
                    ManageServerConnectClientThread manageServerConnectClientThread = new ManageServerConnectClientThread();
                    manageServerConnectClientThread.addServerConnectClient(scct, u.getUserId());
                    scct.start();


                } else {

                    //登录失败
                    message.setMesType(Message.MESSSAGE_LOGIN_FAIL);
                    objectOutputStream.writeObject(message);
                    //关闭socket
                    socketaccept.close();
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
