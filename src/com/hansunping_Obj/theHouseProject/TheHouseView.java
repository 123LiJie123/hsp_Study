package com.hansunping_Obj.theHouseProject;

import java.util.Scanner;

public class TheHouseView {
    /*
    1、显示界面
    2、接收用户的输入
    3、调用HouseService完成对房屋信息的各种操作
     */
    House[] houses = new House[50];
    TheHouseService theHouseService = new TheHouseService();
    static int anInt = 0;

    public void createView() {
        boolean loop = true;
        int key;
        String choice;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("------------------------房屋出租系统------------------------");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");

            System.out.print("请选择(1-6)");
            key = scanner.nextInt();

            switch (key) {
                case 1:
                    String name;
                    String phone;
                    String address;
                    int rent;
                    String condition;
                    System.out.println("------------------------添加房屋------------------------");
                    System.out.print("姓名：");
                    name = scanner.next();
                    System.out.print("电话：");
                    phone = scanner.next();
                    System.out.print("地址：");
                    address = scanner.next();
                    System.out.print("租金：");
                    rent = scanner.nextInt();
                    System.out.print("状态：");
                    condition = scanner.next();
                    houses = theHouseService.addHouseinfo(anInt, name, phone, address, rent, condition, houses);
                    System.out.println("------------------------添加完成------------------------");
                    anInt++;
                    break;
                case 2:
                    int find;
                    System.out.print("请输入你要查找的id");
                    find = scanner.nextInt();
                    if (find > anInt||find<=0){
                        System.out.println("------------------------没有该房屋------------------------");
                    }else {
                        System.out.println("------------------------查找房屋------------------------");
                       theHouseService.seekHous(find - 1,houses);
                        System.out.println("------------------------查找房屋------------------------");
                    }

                    System.out.println("查找房屋");
                    break;
                case 3:
                    System.out.println("删除房屋");
                    break;
                case 4:
                case 5:
                    System.out.println("房屋列表");
                    break;
                case 6:

                    while (true) {
                        System.out.println("你确定退出?y/n");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                        System.out.println("系统退出");
                    }


                    break;
            }


        } while (loop);
    }
}
