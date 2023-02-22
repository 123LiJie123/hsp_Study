package com.hansunping_Obj.inner_class;

//演示局部内部类的使用
public class LocalInnerClass {
    public static void main(String[] args) {
        new Outer02().m1();
    }
}

class Outer02 {//外部类
    private int n1 = 100;

    public void m1() {//方法
        //1、局部内部类是定义在外部类的局部位置，通常在方法
        //3、不能添加访问修饰符，但是可以使用final修饰
        class Inner02 {//局部内部类（本质仍然是一个类）
            private int n1 = 800;

            //2、可以直接访问外部类的所有成员，包含私有的
            public void f1() {
                //5、如果外部类和局部类的成员重名时，默认遵循就近原则
                System.out.println("n1=" + n1);

                //如果想访问外部类的n1使用(外部类.this.成员)去访问
                //Outer02.this 本质就是外部类的对象，即哪个对象调用了m1,Outer02.this就是哪个对象
                System.out.println("外部类的n1=" + Outer02.this.n1);
            }
        }
        Inner02 inner02 = new Inner02();

        inner02.f1();

    }


}
