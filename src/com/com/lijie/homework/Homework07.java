package com.com.lijie.homework;

public class Homework07 {
    //编写应用程序，使用for循环语句计算8+88+888+……前10项之和。
    public static void main(String[] args) {
        long k = 8;
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + k;
            k = k*10+8;
        }
        System.out.println(sum);
    }
}
