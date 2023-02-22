package com.com.lijie.homework;
public class E {

    char x='你',y='e',z='吃';
    public static void main(String[] args) {
        int s3='苹'+'果';
        char s4=(char)s3;
        System.out.println(s3);
        char x='你',y,z;
        //char x='你',y='e',z='吃';
        if(x>'A'){
            y='苹';
            z='果';
        }
        else
            y='酸';
        z='甜';
        System.out.print(x+","+y+"'"+z);
    }
}
