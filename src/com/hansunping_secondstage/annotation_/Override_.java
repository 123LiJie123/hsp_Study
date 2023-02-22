package com.hansunping_secondstage.annotation_;

public class Override_ {
    public static void main(String[] args) {

        Son son = new Son();

        son.fly();

    }


}

class Father {
    public void fly() {
        System.out.println("Father……fly……");
    }


}

@Deprecated
class Son extends Father {
    //1、@Override注解放在fly方法上，表示子类的fly方法重写了父类的fly方法

    @Override
    public void fly() {
        System.out.println("Father……fly……");
    }

}