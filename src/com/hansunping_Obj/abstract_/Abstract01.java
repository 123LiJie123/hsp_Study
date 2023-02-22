package com.hansunping_Obj.abstract_;

public class Abstract01 {

    public static void main(String[] args) {

    }

}

//思考：这里eat实现了，其实没什么意义
//父类方法不确定性问题
//------》考虑将该方法设计为抽象(abstract)方法

//
abstract class Animal{
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
}
