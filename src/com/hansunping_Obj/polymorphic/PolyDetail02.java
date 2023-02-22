package com.hansunping_Obj.polymorphic;

public class PolyDetail02 {
    public static void main(String[] args) {
//  instanceOf比较操作符，用于判断对象的运行类型是否为某个类型或某个子类型

        //编译类型是BB, 运行类型是BB
        BB bb = new BB();
        System.out.println(bb instanceof BB);  //true
        System.out.println(bb instanceof AA);  //true

        //编译类型是AA，运行类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);  //true
        System.out.println(aa instanceof AA);  //true
        
        //编译类型是AA ,运行类型是AA
        AA aa1 = new AA();
        System.out.println(aa1 instanceof BB);  //false

    }
}
class AA{ //父类

}

class BB extends AA{  //子类

}
