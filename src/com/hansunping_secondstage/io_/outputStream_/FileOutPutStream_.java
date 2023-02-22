package com.hansunping_secondstage.io_.outputStream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream_ {
    public static void main(String[] args) {
        //使用FileOutputStream在a.txt文件，中写入“Hello,world”，如果文件不存在FileOutputStream会创建文件
    }


    @Test
    public void m1() {
        String filePath = "D:/file/hello.txt";
        String writeString = "root";
        FileOutputStream fileOutputStream = null;

//new FileoutputStream(filePath) 创建方式,当写入内容时,会覆盖原来的内容
        try {
            fileOutputStream = new FileOutputStream(filePath);

            //1、写入一个字节
            fileOutputStream.write('a');

            //2、写入字符串
            //str.getBytes() 可以把字符串--->字节数组
            fileOutputStream.write(writeString.getBytes());

            //3、write(byte[] b, int off, int len)  将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流
            fileOutputStream.write(writeString.getBytes(), 0, writeString.length());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream(filePath);
            fileOutputStream1.write("sadsad".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void m2() {
        String filePath = "D:/file/hello.txt";
        String writeString = "root";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            //String.getBytes() 可以把字符串---->字节数组
            fileOutputStream.write(writeString.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
