package com.hansunping_Obj.polymorphic.polyparameter_;

public class Employee {
// 定义员工类Employee,包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
    private String name;// 姓名
    private double salary;  //月工资

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return salary * 12;
    }
}
