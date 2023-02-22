package com.hansunping_firstStage;

public class Object01 {
    public static void main(String[]args){

        //实例化一只猫[创建一个猫对象]
        Cat cat = new Cat();
        cat.age = 5;
        cat.color = "黑白";
        cat.name = "小花";

    }
}
//使用面向对象的方式来解决养猫问题
//分析：
//定义一个猫类Cat-->自定义一个数据类型

class Cat{
    //属性
    String name;   //名字
    int age;   //年龄
    String color;   //颜色
}
