package com.hansunping_Obj.extend.Override_package;

public class Dog extends Animal{
    //1、因为Dog是Animal子类
    //2、Dog的cry方法和Animal的cry定义形式一样(名称、返回类型、参数)
    //3、这时我们就说Dog的cry方法，重写了Animal的cry方法。
    /*
    注意事项和使用细节
    方法重写也叫覆盖，需要满足下面的条件：
    1、子类的方法的形参列表、方法名称，要和父类方法的形参列表，方法名称完全一样
    2、子类方法的返回类型和父类的方法返回类型一样，或者是父类返回类型的子类。
    3、子类方法不能缩小父类方法的访问权限。
     */


    public void cry(){
        System.out.println("小狗汪汪叫。。。。");
    }
//子类方法的返回类型和父类方法返回类型一样，或者是（父类返回类型的子类）

    public String m1(){
        return null;
    }
}
