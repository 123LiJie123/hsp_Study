package com.design_pattern.singlePattern;

public class Single02 {
    //懒汉式

    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat.name);
    }



}


class Cat{
//懒汉式
    private  static Cat cat;
    String name;

    private Cat(String name){
        this.name = name;
    }

        public static Cat getInstance(){
        if(cat ==null){//如果没有创建cat对象
            cat = new Cat("小花");
        }
        return cat;
        }
}
