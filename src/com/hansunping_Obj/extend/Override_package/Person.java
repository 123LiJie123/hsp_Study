package com.hansunping_Obj.extend.Override_package;

public class Person {
    private String name;
    private int age;
   public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
       return "我是："+ name+"今年："+age;
    }
}
