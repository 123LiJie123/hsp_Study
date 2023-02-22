package com.hansunping_secondstage.io_.outputStream_;

import java.io.Serializable;

public class Dog implements Serializable {
    //serialVersionUID序列化的版本号，可以提高兼容性

    //如果添加这个值后，修改类的属性后，再读的时候不会报错
    private static final long serialVersionUID = 1L;


    int asd = 123;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int anInt;
    char sex;
    String color;

    public Dog(int anInt, char sex, String color) {
        this.anInt = anInt;
        this.sex = sex;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "anInt=" + anInt +
                ", sex=" + sex +
                ", color='" + color + '\'' +
                '}';
    }
}
