package com.com.lijie.homework;

public class Homework06 {

    //求完数
    public static void main(String[] args) {
        int sum;
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0){
                    sum = sum + j;
                }
            }
            if (sum == i){
                System.out.println(i+"是完数");
                count++;
            }
        }

        System.out.println("1000以内一共有"+count+"个完数");
    }
}
