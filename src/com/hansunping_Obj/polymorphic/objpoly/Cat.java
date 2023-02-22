package com.hansunping_Obj.polymorphic.objpoly;

public class Cat extends Animal {

    public void cry() {
        System.out.println("Cat cry()猫在叫.....");
    }

    public Cat(String name){
        super(name);
    }
}
