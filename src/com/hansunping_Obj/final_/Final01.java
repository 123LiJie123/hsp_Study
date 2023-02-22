package com.hansunping_Obj.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();

    }
}

// 当不希望A类被继承时
// 可以使用final来修饰A类
final class A{

}


//如果我们要求hi不能被子类重写
//可以使用final修饰 hi方法
class C{

    final public void hi(){}
}

//当不希望类的某个属性的值被修改，可以用final修饰
class E{
final public double TAX_RATE = 0.08;
}


//当不希望某个局部变量被修改
//可以用final修饰
class F{
    public void cry(){
        //这时，NUM也称为局部常量
        final double NUM = 0.01;

    }
}


