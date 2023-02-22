package com.com.lijie.homework;

public class Homework02 {
    //输出全部希腊字母
    public static void main(String[] args) {
        Homework01 homework01 = new Homework01();
        System.out.println("α的unicode码为："+Homework01.gbEncoding("α"));   //0x3b1
        System.out.println("ω的unicode码为："+Homework01.gbEncoding("ω"));  //0x3c9
        for (int i = 0x3b1; i <= 0x3c9 ; i++) {
            System.out.print((char)i+"  ");
        }

    }
}
