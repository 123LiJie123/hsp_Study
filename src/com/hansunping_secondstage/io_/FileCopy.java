package com.hansunping_secondstage.io_;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    /*
    完成文件拷贝，将"D:/dl.png"拷贝到“D:/file/”文件夹中。
     */

    //思路分析：
    //1、创建文件输入流，将文件读入到程序
    //2、创建文件输出流，将读取到的文件写入到指定的文件。

//在完成程序时，应该是读取部分就输出目的。


    public static void main(String[] args) {
        String filePath = "D:/dl.png";
        String objFilePath = "D:/file/dl.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[16];

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(objFilePath);
            while (fileInputStream.read(buf) != -1) {
                fileOutputStream.write(buf);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }


            } catch (Exception e) {

            }

        }
    }


}
