package com.hansunping_secondstage.io_.reader_;


import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {

    private static FileReader fileReader;

    public static void main(String[] args) {

    }

    @Test
    //单个字符读取文件
    public void readFile01() {

        //使用FileReader从story.txt读取内容，并显示
        try {
            fileReader = new FileReader("D:\\file\\story.txt");
            System.out.println(fileReader.getEncoding());

            int data;

            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void readFile02() {
        FileReader fileReader = null;
        int bufLength = 8;  // 一次读字符的长度
        char[] buff = new char[8];

        try {
            fileReader = new FileReader("D:\\file\\story.txt");
            while (fileReader.read(buff) != -1) {
                System.out.print(new String(buff, 0, buff.length));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
