package com.hansunping_Obj.object_;

//演示Finalize的使用
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;   //这时Car对象就是一个垃圾，垃圾回收器就会回收对象，在销毁对象前会调用该对象的finalize方法。
        //程序员就可以在finalize中，写自己的业务逻辑代码（比如释放资源：数据库连接，或者打开文件...）
        //如果程序员不重写finalize，那么就会调用Object类的finalize，即默认处理
        //如果程序员重写了finalize，就可以实现自己的逻辑

        System.gc();  //垃圾回收机制的调用，是由系统来决定(即有自己的gc算法)的，也可以通过System.gc()主动触发垃圾回收机制
        System.out.println("程序退出了...");

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车");
        System.out.println("释放了某些资源");

    }
}