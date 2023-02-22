package com.hansunping_Obj.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
        System.out.println(IA.n1);   //说明n1是静态的

//        IA.n1 = 11;   说明n1是final

        System.out.println(Cat.n1);
        IA.h3();
        Cat cat = new Cat();



    }
}

//接口不能被实例化
//接口中所有的方法是public 方法，接口中抽象方法，可以不用abstract修饰
interface IA {
     int n1 = 10;   //等价 public static final int n1 = 10;
    void say();

    public static void h3(){

    }
}

interface  IB{
    void hi();
}

interface  IC{
    void hi1();
}


//一个类同时可以实现多个接口
class Cat implements IA,IB,IC {

    @Override
    public void say() {



    }

    @Override
    public void hi() {

    }

    @Override
    public void hi1() {

    }
}

//抽象类去实现接口时，可以不实现接口的抽象方法。
abstract class Abstract implements IA{

}
