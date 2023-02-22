package com.hansunping_Obj.polymorphic.objpoly;

public class Dog extends Animal{

    public void cry() {
        System.out.println("dog cry() 狗在叫....");
    }
    public Dog(String name){
        super(name);
    }

    public void run(){
        System.out.println("跑");
    }
}
