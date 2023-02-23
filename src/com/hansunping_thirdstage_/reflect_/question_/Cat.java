package com.hansunping_thirdstage_.reflect_.question_;

public class Cat {
    private String name = "招财猫";
    public int age = 9;

    public Cat() {

    }

    public Cat(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public void hi() {
//        System.out.println("hi" + name);
    }

    public void cry() {
        System.out.println(name + "喵喵喵叫……");
    }

}
