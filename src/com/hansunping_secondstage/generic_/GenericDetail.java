package com.hansunping_secondstage.generic_;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        //给泛型指定数据类型时，要求是引用类型，不能是基本数据类型
        ArrayList<Integer> integers = new ArrayList<>();   //OK
//        List<int>    //错误


        //2、
        ArrayList<A> as = new ArrayList<>();
        Pig<A> aPig = new Pig<A>(new B());
        aPig.f();


        //3、泛型的使用形式
        ArrayList<Integer> integers1 = new ArrayList<>();
        //也可以用其接口来接收
        List<Integer> list = new ArrayList<>();

        //在实际开发中，经常用其简写方式
        //编译器会进行类型推断，推荐使用此写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        ArrayList arrayList = new ArrayList();
        System.out.println();
    }
}


class A {

}


class B extends A {
}


class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass()); //打印出e的运行类型
    }
}

