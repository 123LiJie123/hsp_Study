package com.hansunping_thirdstage_.reflect_;

public class ReflecCreateInstance {
    //通过反射创建某个类的对象，要求该类中必须有public的无参构造
    //通过调用某个特定的构造器的方式，实现创建某类的对象
}


class User {
    private int age;
    private String name;

    public User() {

    }

    public User(int age, String name) {
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
