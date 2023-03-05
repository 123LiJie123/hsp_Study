package com.hansunping_forthstage.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 演示C3P0的使用
 */

public class C3P0_ {
    public static void main(String[] args) {

    }

    //方式一：相关的参数，在程序中指定
    @Test
    public void testC3P0_01() {
        //1.创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        //2.通过配置文件mysql.properties 获取相关连接的信息

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\IDEA_WORK\\初学\\src\\mysql.properties"));
            //获取相关的属性值
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driver = properties.getProperty("driver");

            //给数据源 combopooledDataSource 设置相关的参数
            //注意：连接管理是由 combopooledDataSource来管理
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);

            //设置初始化连接数
            comboPooledDataSource.setInitialPoolSize(10);
            //设置最大连接数
            comboPooledDataSource.setMaxPoolSize(50);

            //测试连接池的效率，测试对mysql5000次操作
            long start = System.currentTimeMillis();
            for (int i = 0; i < 5000; i++) {
                Connection connection = comboPooledDataSource.getConnection();//这个方法就是从DataSource接口实现
//                System.out.println("连接成功");
                connection.close();
            }

            long end = System.currentTimeMillis();
            System.out.println("c3p0 5000连接mysql耗时" + (end - start));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    //方式二：使用配置文件模板来完成
    //1、将c3p0提供的c3p0.config.xml 拷贝到src目录下
    //2、该文件指定了连接数据库和连接池的相关参数
    @Test
    public void testC3P0_02() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
            Connection connection = comboPooledDataSource.getConnection();
            System.out.println("连接Ok~");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
