package com.hansunping_firstStage;

public class constructorExercise {
    public static void main(String []args){
        //前面我们在创建人类的对象时，是先把一个对象创建好后，再给他的年龄和姓名属性赋值，
        // 如果现在我要求，在创建人类的对象时，就直接指定这个对象的年龄和姓名，该怎么做？
        // 这时就可以使用构造器


        /*
        构造器的修饰符可以默认，也可以是public protected private
        构造器没有返回值
        方法名和类名字必须一样
        参数列表和成员方法一样的规则
        构造器的调用由系统完成
         */



    }


}

class Person1{
    String name;
    int age;
    public Person1(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
