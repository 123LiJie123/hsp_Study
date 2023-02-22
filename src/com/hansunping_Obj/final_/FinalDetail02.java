package com.hansunping_Obj.final_;

public class FinalDetail02 {
    public static void main(String[] args) {

        System.out.println(BBB.num);

    }

}

final class AAA{
    //一般来说，如果一个类已经是final类了，就没有必要再将方法修饰成final方法
    //public final
}

//final和static往往搭配使用，效率更高，不会导致类加载底层编译器做了优化处理。
class BBB{
    public  static final int num = 10000;

    static {
        System.out.println("BBB 静态代码块被执行");
    }
}
