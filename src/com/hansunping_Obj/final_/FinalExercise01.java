package com.hansunping_Obj.final_;

public class FinalExercise01 {

    public static void main(String[] args) {
        Circle circle = new Circle(2);

        System.out.println(circle.getArea());
    }


}


class Circle {
    //编写一个程序，能够计算圆形的面积。要求圆周率为3.14.赋值的位置3个方式都写一下。

    /*
    final修饰的属性三个赋值位置
    ①可以在构造器中赋值
    ②可以在定义时赋值
    ③可以在代码块中赋值
     */
    private final double PI = 3.14;
    private double radius;  //这个是圆的半径
    private final double area = radius * radius * PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public int addOne(final int i) {
        return i + 1;
    }


}