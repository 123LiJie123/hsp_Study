package com.hansunping_thirdstage_.reflect_;

import java.io.FileInputStream;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\IDEA_WORK\\初学\\src\\com\\hansunping_thirdstage_\\reflect_\\question_\\re.properties"));

        String fullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        Class<?> aClass = Class.forName(fullPath);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);


        //java.lang.reflect.Field:代表类的成员变量，Field对象表示某个类的成员变量
        //得到Cat类的Name字段
        //getFiled不能得到私的属性
        Field nameField = aClass.getField("age");
        System.out.println(nameField.get(o));   //传统写法对象，成员变量，反射：成员变量对象.get(对象)


        //java.lang.reflect.Constructor:代表类的构造方法，Constructor对象表示构造器
        Constructor<?> constructor = aClass.getConstructor();//（）中可以指定的构造器参数类型，返回无参构造器
        System.out.println(constructor);

        //得到有参构造器
        Constructor<?> constructor1 = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);


    }
}
