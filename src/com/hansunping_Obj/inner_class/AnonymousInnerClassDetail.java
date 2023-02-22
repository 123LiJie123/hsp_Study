package com.hansunping_Obj.inner_class;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {


    }


}


class outer{
    public void f1(){
        //匿名内部类要写在外部类的局部位置
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法");

            }
        };
    }
}

class Person{
    public void hi(){
        System.out.println("");
    }
}