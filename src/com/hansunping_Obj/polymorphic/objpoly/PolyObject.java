package com.hansunping_Obj.polymorphic.objpoly;

public class PolyObject {
    public static void main(String[] args) {

//        //体验对象多态特点
//
//        //animal 编译类型就是 Animal，运行类型是Dog
//        Animal animal = new Cat();
//        animal.cry();//因为运行时，执行到该行时，animal运行类型是Dog
//
//        animal = new Dog();
//        animal.cry();

        Animal dog = new Dog("小花");
        Bone bone = new Bone("骨头");
        Master master = new Master();

        Cat cat = new Cat("花某");
        Food fish = new Fish("鱼");

        master.feed(cat,fish);







        master.feed(dog,bone);


    }
}
