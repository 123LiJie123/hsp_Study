package com.hansunping_secondstage.io_.transformation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CodeQuestion {
    public static void main(String[] args) throws Exception {
        /*
        编码问题：如果文件的格式和IDEA Project Encoding编码不一致会出现乱码
        读取D:\\file\\note.txt文件到程序
        思路：
        1、创建字符输入流BufferedReader
        2、使用BufferedReader对象读取 note.txt
        3、默认情况下，读取到的文件是按照Project Encoding编码写入出

         */

        String filePath = "D:\\file\\note.txt";
        String o;

        BufferedReader bfd = new BufferedReader(new FileReader(filePath));
        while ((o = bfd.readLine()) != null) {
            System.out.println(o);
        }


        BufferedWriter bfw = new BufferedWriter(new FileWriter(filePath, true));
        bfw.write("HSP学JAVA");


        bfd.close();
        bfw.close();
    }
}
