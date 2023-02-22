package com.hansunping_Obj.polymorphic.polyparameter_;

public class Manager extends Employee{
/*
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工多了work方法，
普通员工和经理类要求分别重写getAnnual方法
 */

private double bonus;


    public Manager(String name, double salary,double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }


    public void manage(){
        System.out.println("管理人");
}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;  //super.getAnnual使用到了动态绑定机制
    }


}
