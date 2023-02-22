package com.hansunping_secondstage.io_.inputStream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    //请使用FileInputStream读取hello.txt文件，并将文件内容显示到控制台。
    public static void main(String[] args) {

    }
    /*
      演示FileInputStream的使用（字节输入流 文件---->程序）
          单个字节的读取，效率比较低

       */

    @Test
    public void readFile01() {
        String filePath = "D:\\file\\story.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;

        //创建 FileInputStream对象，用于读取文件
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。


            //如果返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //在读取完毕后将文件流关闭，防止造成资源浪费
                fileInputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void readFile02() {
        //采用read(Byte[]b)优化
        String filePath = "D:\\file\\story.txt";


        int read = 0;
        FileInputStream fileInputStream = null;
        byte[] buf = new byte[8];   //一次读取8个字节.


        // 创建FileInputStream对象，用于读取文件
        try {

            fileInputStream = new FileInputStream(filePath);

            //如果读取正常,返回实际读取的字节数
            while (fileInputStream.read(buf) != -1) {

                System.out.print(new String(buf, 0, buf.length));   //显示
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
