package com.hansunping_secondstage.io_.transformation;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\file\\a.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath, true), "utf-8");

        BufferedWriter bfw = new BufferedWriter(osw);
        bfw.write("阿斯顿撒旦基本面");


        bfw.close();
    }
}
