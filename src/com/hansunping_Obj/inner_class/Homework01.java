package com.hansunping_Obj.inner_class;

public class Homework01 {
    /*
    1、计算器接口具有work方法，功能是运算，有一个手机类Cellphone,定义方法testWork测试计算功能，调用计算接口的work方法
    2、要求调用CellPhone对象的testWork方法，使用上匿名内部类
     */

    public static void main(String[] args) {

        Cellphone02 cellphone = new Cellphone02();

        cellphone.testWork(new Calculator() {
            @Override
            public void work() {
                System.out.println("运算");
            }
        });
    }
}


interface Calculator {
    abstract void work();
}


class Cellphone02 {
    public void testWork(Calculator cal) {
        cal.work();
    }
}