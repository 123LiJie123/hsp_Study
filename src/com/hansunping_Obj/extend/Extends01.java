package com.hansunping_Obj.extend;

public class Extends01 {

    //继承
    /*
    为什么需要继承？
    复用.
     */

    //编写两个类，一个是Pupil类（小学生），一个是Graduate(研究生)。
    //问题：两个类的属性和方法有很多是相同的，怎么办？
    //2、子类必须调用父类的构造器，完成父类的初始化。
    //3、当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
    // 如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过。






    //子类能继承父类的私有属性，但子类没有这一私有属性的访问权限。可以通过其他公共成员方法来调用私有成员。
    public static void main(String[] args) {
//        Father f1 = new Father();
//        Son s1 = new Son();


//        f1.sayHi();
//        s1.sayHi();
//        System.out.println();
//        f1.setName("Sam");
//        f1.sayHi();
//        s1.sayHi();
//        System.out.println();
//        s1.setName("Tom");
//        f1.sayHi();
//        s1.sayHi();

    }


}
class Father {
    private String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }
    public void sayHi() {
        System.out.println("My name is " + name);
    }

    public Father(String name){
        this.name = name;
    }
}

//class Son extends Father {



// public Son(String name){
//     this.name = name;
//     this.age = 10;
// }
//}