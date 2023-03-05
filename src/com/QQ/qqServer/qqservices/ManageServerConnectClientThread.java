package com.QQ.qqServer.qqservices;

import java.util.HashMap;
import java.util.Set;

public class ManageServerConnectClientThread {


    static ServerConnectClientThread scct;
    public static HashMap<String, ServerConnectClientThread> hm
            = new HashMap<>();

    public static void addServerConnectClient(ServerConnectClientThread scct, String userId) {
        hm.put(userId, scct);
    }

    public static ServerConnectClientThread getServerConnectClient(String userId) {
        return hm.get(userId);
    }

    public static String getUserId() {
        String idStr = "";
        Set<String> strings = hm.keySet();
        for (String str : strings) {
            idStr += str + " ";
        }
        return idStr;
    }


}
