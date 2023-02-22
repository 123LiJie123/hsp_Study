package com.hansunping_Obj.abstract_;


class   AbstractExercise01 {
    /*
    编写一个Employee类，声明为抽象类，包含如下三个属性：name, id, salary。 提供必要的构造器和抽象方法：work()。对于Manager类来说，
  他既是员工，还具有资金(bonus)的属性。请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问，实现
  work(),提示“经理/普通员工 名字 工作中.....”
    */
    public static void main(String[] args) {
        CommonEmployee xm = new CommonEmployee("小明", "123", 21);


        Manager xl = new Manager("小丽", "0123", 23);


        xm.work();

        xl.work();
    }
    
    
}

abstract class Empolyee{
    private String name;
    private String id;
    private double salary;


    public Empolyee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void work();
}

//设计CommonEmployee类和Manager类


class CommonEmployee extends Empolyee{

    //经理/普通员工 名字 工作中.....
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"工作中");
    }
}


class Manager extends Empolyee{




    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }
//经理/普通员工 名字 工作中.....
    @Override
    public void work() {
        System.out.println("经理"+getName()+"工作中");
    }
}
