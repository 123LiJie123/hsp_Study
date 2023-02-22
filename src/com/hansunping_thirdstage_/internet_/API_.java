package com.hansunping_thirdstage_.internet_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) {
        try {
            //1、获取本机的InetAddress对象
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            //2、根据指定主机名，获取InetAddress对象
            InetAddress byName = InetAddress.getByName("DESKTOP-4S9DMK0");
            System.out.println(byName);

            //3、根据域名返回一个InetAddress对象，比如www.baidu.com对应的Inet对象
            InetAddress byName1 = InetAddress.getByName("wwww.baidu.com");
            System.out.println(byName1);

            //4、通过InetAddress对象，获取对应的地址
            String hostAddress = localHost.getHostAddress();
            System.out.println(hostAddress);


            //5、通过InetAddress对象，获取对应的主机名/域名
            String hostName = byName1.getHostName();
            System.out.println(hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
