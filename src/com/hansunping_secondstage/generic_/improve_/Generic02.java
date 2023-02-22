package com.hansunping_secondstage.generic_.improve_;

import java.util.ArrayList;


public class Generic02 {
     /*
    (1)请编写程序，在ArrayList中，添加3个Dog对象
    (2)Dog对象含有name和age,并输出name和age(要求使用getXxx()).
     */
    //使用泛型来完成代码

    //1、当我们ArrayList<Dog>表示存放到ArrayList集合中的元素是Dog类型（）
    //2、如果编译器发现添加的类型，不满足要求，就会报错
    //3、在遍历的时候，可以直接取出Dog类型而不是Object类型

    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("小黄", 10));
        arrayList.add(new Dog("大黄", 12));
        arrayList.add(new Dog("小黑", 9));


        //假如我们程序员，不小心添加了一只猫  就会报错
//        arrayList.add(new Cat("招财", 8));
        for (Dog o :
                arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "--" + dog.getAge());
        }
    }
}


class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{name=" + name + ",age=" + age + "}";
    }
}


class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{name=" + name + ",age=" + age + "}";
    }
}
