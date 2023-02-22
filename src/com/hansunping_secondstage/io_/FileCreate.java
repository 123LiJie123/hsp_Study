package com.hansunping_secondstage.io_;

import org.junit.Test;

import java.io.*;

public class FileCreate {
    //演示创建文件
    public static void main(String[] args) {


    }

    //方式一、
    //    new File(String pathname) //根据路径构建一个File对象
    @Test
    public void create01() {
        String filePath = "D:\\file\\news1.java";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }




    //方式二、
//     new File(File parent, String child)  //根据父目录文件 + 子路径构建
    // 如果目录是  D:\\file\\news2.txt  则父目录为D:\\file\\
    @Test
    public void create02() {
        File file = new File("D:\\file\\");
        File file1 = new File(file, "news2.txt");
        try {
            file1.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //  new File(String parent, String child)  //根据父目录 + 子路径构建
    @Test
    public void create03() {
        String parentPath = "D:\\file\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
