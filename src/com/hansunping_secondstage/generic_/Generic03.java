package com.hansunping_secondstage.generic_;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> hsp = new Person<>("韩顺平教育");
        System.out.println(hsp.f());

    }
}

class Person<E> {
    //泛型的作用是：可以在类声明时通过任意一个标识表示类中某个属性的类型。
    //或者是某个方法的返回值的类型，或者是参数类型。
    E s;

    Person(E s) {  //E也可以是参数类型
        this.s = s;
    }

    public E f() { //返回类型使用E
        return s;
    }
}
