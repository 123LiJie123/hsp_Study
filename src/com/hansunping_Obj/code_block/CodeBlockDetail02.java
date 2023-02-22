package com.hansunping_Obj.code_block;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        BB bb = new BB();
    }
}



class BB{

    public BB(){
        System.out.println("构造器BB被调用");
    }
    static {
        System.out.println("BB静态代码块01");
    }

    private static int n1 = getN1();

    private  int n2 = getN2();
    { //普通代码块
        System.out.println("BB普通代码块01");
    }

    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2(){  //普通方法
        System.out.println("getN2被调用");
        return 100;
    }

    {

    }
        }