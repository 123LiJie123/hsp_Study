package com.hansunping_Obj.inner_class;

public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}

class Outer{
    private int n1 = 100;// 属性

    public void m1(){//方法

    }

    {
        System.out.println("代码块……");

    }


    class Inner{
        //内部类，在Outer类的内部
    }
}
