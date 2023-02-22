package com.hansunping_Obj.inner_class;

public class Homework02 {
    /*
    1、编一个类A，在类中定义局部内部类B，B中有一个私有常量name，有一个方法show()打印常量name。进行测试
    2、进阶：A中也定义一个私有的变量name，在show方法中打印测试。
     */

    public static void main(String[] args) {
        new A().new B().show();
    }
}


class A {
    private String name = "田田波";

    class B {
        private String name = "维波";

        public void show() {
            System.out.println(name);
            System.out.println(A.this.name);
        }
    }
}
