package com.hansunping_Obj.packing;

public class packing02_Example {
    /*
    1、不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认。
    2、年龄必须在1-120,年龄，工资不能直接查看，name的长度在2-6之间。
     */

    public static void main(String[] args) {
        Person person = new Person("jack",12,123);
        person.name = "jack";


    }
}
class Person{
    public String name;  //名字公开
    private int age;  //年龄是私有的
    private double salary; //工资是私有的

    Person(String name, int age, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
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
        if (age>=1 && age <= 120){
            this.age = age;  //如果是合理范围
        }else {
            System.out.println("年龄需在1-120");
            this.age = 18;  //给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void info(){

    }
}
