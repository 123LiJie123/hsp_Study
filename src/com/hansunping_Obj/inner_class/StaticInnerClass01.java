package com.hansunping_Obj.inner_class;

public class StaticInnerClass01 {
    public static void main(String[] args) {

    }

}

class Outer05{
    private int n1 = 10;
    private static String name = "张三";
    static class Inner02{
        public void say(){
            System.out.println(name);
            //不能直接访问外部类的非静态成员
            //System.out.println(n1);
        }
    }

    public void show(){
        //外部类使用内部类
        new Inner02().say();
    }
}

