package com.hansunping_Obj.theHouseProject;

import java.util.Scanner;

public class TheHouseApp {
  static  int  id = 1;
    String name;
    String phone;
    String address;
    int rent;
    String condition;
    Scanner scanner = new Scanner(System.in);
    House[] houses = new House[50];
    public static void main(String[] args) {
        int i_house = 0;

        boolean loop = true;
        int key;


        TheHouseApp theHouseApp = new TheHouseApp();


        do {
            System.out.println("------------------------房屋出租系统------------------------");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");

            System.out.print("请选择(1-6)");
            key = theHouseApp.scanner.nextInt();


            switch (key) {
                case 1:

                   theHouseApp.add_house();
                    break;
                case 2:
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
                    String choice;
                    while (true) {

                        System.out.println("你确定退出?y/n");
                        choice = theHouseApp.scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }

                    if (choice.equals("y")) {
                        loop = false;
                    }

                    System.out.println("系统退出");

                    break;
            }


        } while (loop);
    }



    //新增房源
    public void add_house(){
        System.out.print("姓名：");
        name = scanner.next();
        System.out.print("电话：");
        phone = scanner.next();
        System.out.print("地址：");
        address = scanner.next();
        System.out.print("月租：");
        rent = scanner.nextInt();
        System.out.print("状态：");
        condition = scanner.next();

        House house = new House(id,name,phone,address,rent,condition);
        houses[id++-1] = house;


    }



    //查找房屋



    //删除房屋



    //修 改 房 屋 信 息



    //房 屋 列 表

}
