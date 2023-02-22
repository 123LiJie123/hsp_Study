package com.hansunping_Obj.polymorphic.question;

public class ploy01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog,bone);
        //主人给 小猫喂 黄花鱼
        Cat cat = new Cat("小眯");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat,fish);

    }
}
