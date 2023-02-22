package com.hansunping_Obj.change_project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //零钱通面向过程的代码


    public static void main(String[] args) {
        //1、完成显示菜单，并可以选择菜单，给出对应提示
        Scanner scanner = new Scanner(System.in);
        int key;
        boolean loop = true;

        //2、完成零钱通明细
        String detail = "-------------------零钱通明细-------------------";

        //3、完成收益入账
        double earn = 0;   //收益
        Date date = null;    //收益的时间  Date是java.util.Date类型，表示日期
        double balance = 0; //余额
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");  //是一个用于日期格式化的对象

        //4、消费
        double consume=0;
        String consum_detail = "";
       String choice = "";




        while (loop){

            System.out.println("\n=================零钱通菜单=================");
            System.out.println("\t\t\t\t1  零钱通明细");
            System.out.println("\t\t\t\t2  收益入账");
            System.out.println("\t\t\t\t3  消费");
            System.out.println("\t\t\t\t4  退出");

            System.out.print("请选择(1-4)：");

            key = scanner.nextInt();

            switch (key){
                case 1:

                    System.out.println(detail);break;
                case 2:
                    System.out.print("收益入账金额：");
                   earn = scanner.nextDouble();
                   //earn的值范围应该校验
                    balance += earn;

                    date = new Date();


                   detail += "\n收益入账：+"+earn + "\t"+sdf.format(date)+"\t"+balance;
                   break;
                case 3:
                    System.out.print("消费说明：");
                    consum_detail = scanner.next();
                    System.out.print("消费金额：");
                    consume = scanner.nextDouble();
                    balance -= consume;
                    detail += "\n\t"+consum_detail+"：-"+consume + "\t"+sdf.format(date)+"\t"+balance;
                    break;
                case 4:

                   while(true){
                       System.out.println("你确定要退出吗y/n");
                       choice = scanner.next();

                       if (choice.equals("y")||choice.equals("n")){
                           break;
                       }

                   }


                   if (choice.equals("y")){
                       loop = false;
                   }else {
                       loop = true;
                   }
                    break;
                    default:
                        System.out.println("输入错误请选择(1-4):");
                        break;
            }

        }

    }

}
