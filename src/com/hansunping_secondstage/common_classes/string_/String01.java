package com.hansunping_secondstage.common_classes.string_;

public class String01 {
    public static void main(String[] args) {
        //1、String对象用于保存字符串，也就是一组字符序列
//        String name = "jack";
//        name = new String("asd");
//
//
//        String string = name.intern();
//
//        System.out.println(name.hashCode());
//        System.out.println(string.hashCode());
//
//
        String a = "hello";
        String b = "abc";


        String c = a + b;



        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);

        System.out.print(ex.str + "  and  ");
        System.out.println(ex.ch);
    }
}


class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
        System.out.println(str);
    }
}
