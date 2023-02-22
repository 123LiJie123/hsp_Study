package com.hansunping_secondstage.io_.properties_;

import java.io.FileReader;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws Exception {
        //使用Properties类来读取mysql.properties文件

        //1、创建Properties对象
        Properties properties = new Properties();


        //2、加载指定的配置文件
        String filePath = "src\\tank.properties";
        properties.load(new FileReader(filePath));

        //把k-v显示到控制台
        properties.list(System.out);


//        properties.setProperty("charset", "utf8");
//        properties.setProperty("user", "汤姆");
//        properties.setProperty("pwd", "abc111");

        System.out.println("--------------------------");

        System.out.println(properties.getProperty("tank3_x"));

//        properties.store(new FileWriter(filePath), "");
    }
}
