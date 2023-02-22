package com.hansunping_secondstage.generic_.customGeneric_;

public class CustomGeneric01 {
    //自定义泛型类
}

//1、Tiger后面泛型，所以我们把Tiger就称为自定义泛型类
//2、T,R,M泛型的标识符，一般是大写字母
//3、泛型标识符可以有多个
//4、普通成员可以使用泛型（属性、方法）
//5、使用泛型的数组，不能初始化。因为不能确定T的类型，无法在内存开空间
//6、静态方法不能使用泛型，因为在类加载时，对象还没有创建，而泛型是在对象创建时指定的。
class Tiger<T, R, M> {
    String name;
    T t;
    R r;
    M m;
    T[] ts;
    //

    public Tiger(String name, T t, R r, M m) {//构造器使用泛型
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    public static void m1(){

    }
}
