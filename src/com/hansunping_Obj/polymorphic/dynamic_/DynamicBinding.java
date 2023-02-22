package com.hansunping_Obj.polymorphic.dynamic_;

public class DynamicBinding {

    public static void main(String[] args) {
        A a  = new B();
        //分别将B类中的sum和sum1方法注释
        System.out.println(a.sum()); //40 --->30

        System.out.println(a.sum1());//30--->20
    }

}

class A{  //父类
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }

    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A{  //子类
    public int i = 20;
//    public int sum(){
//        return i + 20;
//    }

    public int getI(){
        return i;
    }
//    public int sum1(){
//        return i + 10;
//    }
}
