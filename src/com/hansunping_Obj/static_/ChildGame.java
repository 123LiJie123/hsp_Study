package com.hansunping_Obj.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child = new Child("小明");
        Child child1 = new Child("小红");
        Child child2 = new Child("小丽");

        child.join();
        child1.join();
        child2.join();


        System.out.println(child.getCount());

        Child.hi();



    }
}


class Child extends Father{
    //定义一个变量count，是一个类变量（静态变量）
    //该变量最大的特点就是会被child类所有的对象实例共享。
   private static int count=0;
   static private String string;
    private String name;
    public Child(String name){
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入了游戏");
        count++;
    }

    public int getCount(){
        return count ;
    }







}


class Father{
    public static void hi(){
        System.out.println("hi");
    }
        }
