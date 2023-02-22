package com.hansunping_Obj.test;

public class Animal {
    public void shout() {
        System.out.println("动物叫");
    }


    public static void main(String[] args) {
        Animal cat = new Cat();
    }
}


class Cat extends Animal {
    int anInt = 1;
    public void shout() {
        System.out.println("猫叫");
    }
}

class Dog extends  Animal{
    public void shout(){
        System.out.println("狗叫");
    }
}