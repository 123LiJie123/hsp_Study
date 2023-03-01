package com.hansunping_thirdstage_.classload_;

public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {

        //1、加载B类，并生成B的class对象
        //2、连接 num = 0
        //3、初始化阶段
        // 依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句,并合并

        System.out.println(B.num);

        B b = new B();
        System.out.println(b.num);
        // new B(); //类加载
        // System.out.println(B.num);  //100，如果直接使用类的静态属性，也会导致类的加载

        //加载类的时候，是有同步机制控制的


    }
}


class B {
    static {
        System.out.println("B静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B() {
        System.out.println("B() 构造器被执行");
    }
}
