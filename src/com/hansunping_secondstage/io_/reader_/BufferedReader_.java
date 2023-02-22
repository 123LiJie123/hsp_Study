package com.hansunping_secondstage.io_.reader_;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {

    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        String str;
        try {
            FileReader fileReader = new FileReader("D:\\file\\story.txt");

            bufferedReader = new BufferedReader(fileReader);
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
