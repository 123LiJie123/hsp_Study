package com.hansunping_Obj.polymorphic.objpoly;


public class Master {

    public void feed(Animal animal, Food food){
        System.out.println("主人在给"+ animal.getName()+"喂" + food.getFood_name());
    }
}
