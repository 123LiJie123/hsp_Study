package com.hansunping_thirdstage_.reflect_;

import java.io.FileInputStream;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\hansunping_thirdstage_\\reflect_\\question_\\re.properties"));

        String fullPath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        Class<?> aClass = Class.forName(fullPath);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);


        //java.lang.reflect.Field:代表类的成员变量，Field对象表示某个类的成员变量
        //得到Cat类的Name字段
        //getFiled不能得到私的属性
        Field name = aClass.getField("name");


    }
}
