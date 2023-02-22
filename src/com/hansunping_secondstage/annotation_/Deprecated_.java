package com.hansunping_secondstage.annotation_;

public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
    }
}

//1、Deprecated修饰某个元素，表示该元素已经过时
//2、即不再推荐使用，但是仍然可以使用
//3、可以修饰方法、类、字段、包、参数等等
//4、@Deprecated可以作版本升级过渡使用
@Deprecated
class A {

    public int n1 = 10;


    public void hi() {

    }
}
