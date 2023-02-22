package com.com.lijie.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        //字义一个长度为10的整数数组
        int [] a = new int[10];
        Scanner  scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }






        int obj = 1;
        int index;
        Homework03 homework03 = new Homework03();
        homework03.sort(a);


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        if((index=homework03.find(obj,a))!=123432){
            System.out.println("位置为："+index);
        }else {
            System.out.println("找不到");
        }
    }

    public int find( int obj,int[]a){
       int first = 0;
       int last = a.length;
       int mid = (last - first)/2;
        while (first <= last){
            if(a[mid]==obj){
                return mid;
            }else if (a[mid]<obj){
                first = mid;
            }else if (a[mid] > obj){
                last = mid;
            }
            mid = (last+first)/2;
        }
        return 123432;
    }

    public void sort(int[]a){
        //折半查找要先排序
        //排序
        Arrays.sort(a);
    }
}
