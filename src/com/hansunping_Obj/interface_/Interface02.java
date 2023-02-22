package com.hansunping_Obj.interface_;

public interface Interface02 {
    //写属性

    //写方法

    //在jdk8.0可以有默认实现方法，需要使用default关键字修饰。
    default public void myMethod() {
        System.out.println("Interface02");
    }

    //在jdk8后，可以有静态方法
    public static void t2() {
        System.out.println("t2……");
    }

    //在接口中抽象方法可以省略abstract关键字
    public void hi();

}

class A implements Interface02 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        a.myMethod();

    }

    public void hi(){
        System.out.println("hi……");
    }

}
