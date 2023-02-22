package com.hansunping_Obj.abstract_;
/*
按要求实现下列问题：
1、动物类Animal包含了抽象方法 shout();
2、Cat类继承了Animal，并实现shout,打印“猫会喵喵叫”
3、Dog类继承了Animal，并实现方法shout，打印“狗会汪汪叫”
4。在测试类中实例化对象Animal cat = new Cat(),并调用cat的shout方法
5．在测试类中实例化对象Animal dog = new Dog0.并调用dog的shout方法
 */

public class Homework01 {
    public static void main(String[] args) {
        Animal02 cat = new Cat();
        Animal02 dog = new Dog();

        cat.shout();
        dog.shout();
    }
}

abstract class Animal02 {
    abstract public void shout();
}

class Cat extends Animal02 {
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}


class Dog extends Animal02 {
    public void shout() {
        System.out.println("狗会喵喵叫");
    }
}





