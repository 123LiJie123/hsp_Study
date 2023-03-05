package com.hansunping_thirdstage_.reflect_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflecCreateInstance {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1、先获取到User类的Class对象
        Class<?> aClass = Class.forName("com.hansunping_thirdstage_.reflect_.User");
        //2、通过public的无参构造器创建实例
        Object o = aClass.newInstance();

        //3、通过public的有参构造器创建实例
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object xm = constructor.newInstance("小明");
        System.out.println(xm);


        //4、通过非public的有参构造器来创建实例
        Constructor<?> constructor1 = aClass.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);//暴破【暴力破解】，使用反射可以访问private构造器
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2=" + user2);



    }

}


class User {
    private int age;
    private String name;

    public User() {

    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
