package com.hansunping_Obj.polymorphic.objpoly;

public class Animal {
    String name;
    public void cry(){
        System.out.println("Animal cry() 动物在叫....");
    }

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
