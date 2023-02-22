package com.hansunping_secondstage.io_;

import java.io.*;

public class BufferedCopy_Char {

    private static FileReader fileReader;
    private static FileWriter fileWriter;
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    //文件拷贝
    public static void main(String[] args) {
        String srcFilePath = "D:\\file\\story.txt";
        String copyPath = "D:\\file\\story1.txt";
        String string;


        try {
            fileReader = new FileReader(srcFilePath);
            fileWriter = new FileWriter(copyPath);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);

            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
