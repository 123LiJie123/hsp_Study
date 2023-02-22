package com.hansunping_secondstage.io_;

import java.io.*;

public class BufferedCopy_Byte {

    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;
    private static BufferedInputStream bufferedInputStream;
    private static BufferedOutputStream bufferedOutputStream;

    public static void main(String[] args) {
        String srcPath = "D:\\file\\dl.png";
        String srcPathObj = "D:\\file\\d2.png";
        int len = 0;
        byte[] bytes = new byte[1024];




        try {
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(srcPathObj);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            while ((bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
