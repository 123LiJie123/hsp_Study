package com.hansunping_thirdstage_.reflect_;

import com.hansunping_thirdstage_.reflect_.question_.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//测试反射调用的性能，和优化方案
public class Reflection02 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        m1();
        m2();

    }


    //传统方法来调用hi

    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
        }

        long end = System.currentTimeMillis();

        System.out.println("m1()方法调用hi 耗时=" + (end - start));
    }


    //反射机制调用方法
    public static void m2() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\IDEA_WORK\\初学\\src\\com\\hansunping_thirdstage_\\reflect_\\question_\\re.properties"));

        String fullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();


        Class<?> aClass = Class.forName(fullPath);
        Object o = aClass.newInstance();

        long start = System.currentTimeMillis();
        Method hi = aClass.getMethod(methodName);
        hi.setAccessible(true);  //在反射调用方法时，取消访问检查

        for (int i = 0; i < 90000000; i++) {

            hi.invoke(o);
        }

        long end = System.currentTimeMillis();
        System.out.println("m2()方法调用hi 耗时=" + (end - start));


    }
}
