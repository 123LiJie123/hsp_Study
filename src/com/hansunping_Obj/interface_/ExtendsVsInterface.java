package com.hansunping_Obj.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climbing();

        wukong.swimming();
    }
}


class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fish{
    void swimming();
}

interface Birdable{
    void fly();
}



class LittleMonkey extends Monkey implements Fish,Birdable{
    public LittleMonkey(String name){
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"通过学习可以像鱼儿一样游泳");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"通过学习可以像鸟儿一样飞翔");
    }
}
