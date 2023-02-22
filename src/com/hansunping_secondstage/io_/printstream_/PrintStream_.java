package com.hansunping_secondstage.io_.printstream_;

import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws Exception {
//        String filePath = ;
//        new FileOutputStream()
//        new PrintStream()


        PrintStream out = System.out;
        out.println("join");

        out.write("啊实打实".getBytes());


        //我们可以去修改打印流输出的位置
        //1、输出修改成到"D:\\file\\f1.txt"
        //2、"hello,韩顺平教育~"就会输出到 D:\\file\\f1.txt
        //3、 public static void setOut(PrintStream out) {
        //     checkIO();
        //     setOut0(out);    //native方法， 修改了out
        // }

        System.setOut(new PrintStream("D:\\file\\f1.txt"));
        System.out.println("阿德飒飒");


    }
}
