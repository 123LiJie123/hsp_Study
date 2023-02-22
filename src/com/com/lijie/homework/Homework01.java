package com.com.lijie.homework;

public class Homework01 {
    public static void main(String[] args) {
        String s = "你我她";
        System.out.println(s + "--的unicode编码分别是:"+gbEncoding(s));


    }

    public static String gbEncoding(String gbString){
        char[] utfBytes = gbString.toCharArray();

        String unicodeBytes = "";

        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);

            if (hexB.length()<=2){
                hexB = "00"+hexB;
            }
            unicodeBytes = unicodeBytes+"\\u"+hexB;
        }

        return unicodeBytes;
    }

}
