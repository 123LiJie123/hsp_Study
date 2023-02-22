package com.hansunping_secondstage.common_classes.WrapperType;

public class WrapperType {
    public static void main(String[] args) {
        //Boolean
        // Character
        //Byte

        //演示int<---->Integer的装箱和拆箱
        //jdk5前是手动装箱和拆箱


        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);


        //手动拆箱
        //Integer----->int
        int i = integer.intValue();


        //jdk5后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int ->Integer
        Integer integer2 = n2;   //底层使用的是 Integer.valueOf()

        //自动拆箱  Integer ->int
        int n3 = integer1;    //底层使用的是 intValue()方法






        //包装类转成String
        Integer integer3 = 100;//自动装箱
        //方式1
        String str = integer3.toString();
        System.out.println("String-------" + str);
        //方式2
        String str1 = integer3 + "";

        //方式3
        String s = String.valueOf(integer3);



        //String  ------>包装类(Integer)
        String str4 = "1111111";
        int i1 = Integer.parseInt(str4,2);
        System.out.println(i1);


    }
}
