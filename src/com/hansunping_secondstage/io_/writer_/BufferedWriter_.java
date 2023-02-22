package com.hansunping_secondstage.io_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {

    private static BufferedWriter bw;

    public static void main(String[] args) {
        String filePath = "D:\\file\\ok.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            bw = new BufferedWriter(fileWriter);
            bw.write("asdsdasdsad");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
