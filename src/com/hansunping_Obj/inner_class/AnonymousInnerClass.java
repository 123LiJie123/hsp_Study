package com.hansunping_Obj.inner_class;

/*
演示匿名内部类的使用
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();

    }
}
class Outer04{//外部类
private  int n1 = 10;  //属性

    public void method(){// 方法
        //基于接口的匿名内部类
        //1、需求：想使用接口IA，并创建对象
        //2、传统方式，是写一个类，实现该接口，并创建对象
        //3、现在的需求是类只使用一次，后面再不使用 用上述方法比较浪费

        new IA(){

            @Override
            public void cry() {
                System.out.println("老虎叫唤。。。");
            }
        }.cry();
    }
}

interface IA{  //接口
    public void cry();

}

class Father{  //类
    public Father(String name){  //构造器

    }
    public void test(){ //方法

    }
}