package com.com.lijie.super_;

public class B extends A {
    //访问父类的属性，但不能访问父类的private属性 【案例】super.属性名


    public void hi(){
        System.out.println(super.n1);
    }

    //访问父类的方法，不能访问父类的Private方法，super.方法名（参数列表）；

    //访问父类的构造器，super(参数列表)；只能放在构造器的第一句，只能出现一句!
}
