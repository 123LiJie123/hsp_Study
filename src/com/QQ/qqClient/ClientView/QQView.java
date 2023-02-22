package com.QQ.qqClient.ClientView;

import com.QQ.qqClient.qqClientservice.UserClientService;

import java.io.IOException;
import java.util.Scanner;

/**
 * 客户端的菜单界面
 */
public class QQView {
    private boolean loop = true;  //控制是否显示菜单
    private String key = "";   //接收用户的键盘输入
    Scanner scanner = new Scanner(System.in);

    //创建用户客户端服务对象
    private UserClientService userClientService = new UserClientService();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        QQView qqView = new QQView();
        qqView.mainMenu();
    }


    //显示主菜单
    private void mainMenu() throws IOException, ClassNotFoundException {

        while (loop) {
            System.out.println("===========欢迎登录网络通讯系统===========");
            System.out.println("\t\t1 登录系统");
            System.out.println("\t\t9 退出系统");
            System.out.print("请输入你的选择：");
            key = scanner.next();

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.print("请输入用户号：");
                    String userId = scanner.next();
                    System.out.print("请输入密 码：");
                    String pwd = scanner.next();

                    /*
                    将账号和密码拿到服务器匹配
                    编写一个类 UserClientService[用户登录/用户注册服务]
                     */


                    if (userClientService.checkUser(userId, pwd)) {

                        System.out.println("===========欢迎(用户 " + userId + " ）===========");
                        //进入二级菜单
                        while (loop) {
                            System.out.println("\n\"===========网络通信系统二级菜单(用户 " + userId + " ）===========\"");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择：");
                            key = scanner.next();
                            switch (key) {
                                case "1":
                                    // 准备写一个方法，来获取在线用户列表
                                    userClientService.onlineFriendList(userId);
                                    userClientService.onlineFriendList(userId);


                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    loop = false;
                                    break;
                            }
                        }

                    } else {
                        //登录服务器失败
                        System.out.println("==============登录失败==============");

                    }
                    break;
                case "9":
                    loop = false;
                    System.out.println("退出");
                    break;
            }

        }

    }

}
