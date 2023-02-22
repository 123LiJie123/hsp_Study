package com.QQ.qqClient.qqClientservice;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //我们把多个线程放入到HashMap集合中，Key就是用户Id, value就是线程
    //该类管理客户端连接到服务器端的线程的类
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread client) {
        hm.put(userId, client);
    }

    //通过userId可以得到对应线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }
}
