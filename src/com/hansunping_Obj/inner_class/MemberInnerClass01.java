package com.hansunping_Obj.inner_class;

public class MemberInnerClass01 {

    public static void main(String[] args) {

    }

}


class Outer01 {  //外部类
    private int n1 = 10;
    public String name = "张三";

    class Inner01 { //成员内部类,不能写成静态的。
        public void say() {
            System.out.println("Outer01 的 n1=" + n1 + "outer01 的 name = ");
        }
    }

    //成员内部类，是定义在外部类的成员位置上。
    public void t1() {
        Inner01 inner01 = new Inner01();//调用了成员内部类
        inner01.say();
    }


    public Inner01 getInnerInstance() {
        return new Inner01();
    }
}


class Other {
    //外部其他类想访问成员内部类的say方法。
    public void tt() {

        //方法一、
        Outer01 outer01 = new Outer01();
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.say();


        //方法二、
        //使用一个方法来获取Inner类。
        Outer01.Inner01 innerInstance = new Outer01().getInnerInstance();
        innerInstance.say();

    }
}
