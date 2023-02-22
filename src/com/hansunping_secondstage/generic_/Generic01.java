package com.hansunping_secondstage.generic_;

import java.util.ArrayList;

public class Generic01 {
    /*
    (1)请编写程序，在ArrayList中，添加3个Dog对象
    (2)Dog对象含有name和age,并输出name和age(要求使用getXxx()).
     */

    //使用传统的方法来解决
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黄", 10));
        arrayList.add(new Dog("大黄", 12));
        arrayList.add(new Dog("小黑", 9));


        //假如我们程序员，不小心添加了一只猫
        arrayList.add(new Cat("招财", 8));
        for (Object o :
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
