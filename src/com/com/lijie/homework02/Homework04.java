package com.com.lijie.homework02;

public class Homework04 {
    public static void main(String[] args) {
        People people = new People("张三",18,'男',1.8f);
       people.setName("李四");
    }
}
class People {
    String name;   //姓名
    int age;  //年龄
    char sex;  //性别
    float height;  //身高

    public People(String name, int age, char sex, float height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public void speak() {
        System.out.println("你好");
    }

    public int calculate(int...nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
        }

        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

}