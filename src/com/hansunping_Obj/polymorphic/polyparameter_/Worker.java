package com.hansunping_Obj.polymorphic.polyparameter_;

public class Worker extends Employee {

/*
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工多了work方法，
普通员工和经理类要求分别重写getAnnual方法
 */

    public Worker(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void wrok(){
        System.out.println("普通员工工作");
    }
}
