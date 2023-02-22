package com.hansunping_Obj.code_block;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

//        B b = new B();

        System.out.println(AA.a);



    }
}


class AA{

    static int a = 12;


    {
        System.out.println("非静态代码块被执行");
    }

    static{
        System.out.println("静态代码块被执行");
    }


    public AA(){
        System.out.println(" public AA()被执行");
    }
        }

        class B extends AA{
            {
                System.out.println("B非静态代码块");
            }
        }