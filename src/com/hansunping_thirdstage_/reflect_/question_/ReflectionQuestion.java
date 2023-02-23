package com.hansunping_thirdstage_.reflect_.question_;

import com.hansunping_thirdstage_.reflect_.question_.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properties指定信息，创建Cat对象并调用方法hi
        Properties properties = new Properties();

        properties.load(new FileInputStream("src\\com\\hansunping_thirdstage_\\reflect_\\question_\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println(classfullpath);
        System.out.println(method);


        //传统的方法行不通
        //需要运用反射机制去解决这个问题
        //（1）加载类,返回一个Class类型的对象
        Class<?> aClass = Class.forName(classfullpath);

        //(2)通过aClass对象得到你加载的类
        Cat o = (Cat) aClass.newInstance();
        System.out.println(o.getClass());  //运行类型

        //(3) 通过aClass得到你加载的类 的methodName的方法
        //即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = aClass.getMethod(method);

        //(4)通过method1调用方法，即通过方法对象来实现调用方法
        System.out.println("=======================================");
        method1.invoke(o);  //传统方法，对象方法（）,反射机制。

    }
}
