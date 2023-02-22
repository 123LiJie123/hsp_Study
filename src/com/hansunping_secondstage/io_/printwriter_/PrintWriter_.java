package com.hansunping_secondstage.io_.printwriter_;

import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);

        printWriter.print("hi,北京你好");
        printWriter.close();
    }
}
