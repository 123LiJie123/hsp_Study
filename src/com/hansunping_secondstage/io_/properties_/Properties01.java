package com.hansunping_secondstage.io_.properties_;

import java.io.BufferedReader;
import java.io.FileReader;

public class Properties01 {
    public static void main(String[] args) throws Exception {

        //传统方法：引出问题
        //读取mysql.properties文件，并得到ip,user和pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + "值是：" + split[1]);

        }

        //如果我们要求指定的ip值




    }
}
