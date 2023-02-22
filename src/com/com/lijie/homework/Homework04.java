package com.com.lijie.homework;

public class Homework04 {
    //编写应用程序求1！+2！+….+10!
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                count = count*j;
            }
            sum = sum + count;
        }

        System.out.println("结果为："+sum);
    }
}
