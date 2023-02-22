package com.hansunping_Obj.inner_class;

public class MemberInnerClass02 {
    public static void main(String[] args) {

    }
}


class Outer03 {  //外部类
    private int n1 = 10;
    public String name = "张三";

    class Inner01 { //成员内部类,不能写成静态的。因为不可以直接调用静态的类
        public void say() {
            System.out.println("Outer01 的 n1=" + n1 + "outer01 的 name = "+ name);
        }
    }

    //成员内部类，是定义在外部类的成员位置上。
    public void t1() {
        Inner01 inner01 = new Inner01();//调用了成员内部类
        inner01.say();
    }
}
