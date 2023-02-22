package com.hansunping_secondstage.io_.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 1、演示使用InputStreamReader 转换流解决中文乱码问题
 2、将字节流FileInputStream转成字符流  InputStreamReader,指定编码gbk/utf-8
 */
public class InputStreamReader_ {

    private static InputStreamReader isr;

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\file\\a.txt";
        //1、把FileInputStream 转成 InputStreamReader
        //2、指定编码gbk
        isr = new InputStreamReader(new FileInputStream(filePath), "utf-8");

        //3、把InputStreamReader传入BufferedReader


        BufferedReader bfd = new BufferedReader(isr);
        System.out.println("读取到的内容：");
        System.out.println(bfd.readLine());


        //关闭外层流
        bfd.close();

    }
}
