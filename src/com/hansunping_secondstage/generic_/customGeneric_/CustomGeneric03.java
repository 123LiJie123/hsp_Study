package com.hansunping_secondstage.generic_.customGeneric_;

public class CustomGeneric03 {
    //泛型方法

    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100);  //当调用方法时，传入参数，编译器，就会确定类型
    }
}

class Car { //普通类
    public void run() {
    }  //普通方法


    /*
    说明
    1、<T,R>就是泛型
    2、是提供给fly使用的
     */
    public <R, T> void fly(T t, R r) { //泛型方法
    }

    class Fish<T, R> {//泛型类

        public void run() {

        }

        public <U, M> void eat() { //泛型方法
            U u;
            M m;
        }

    }
}
