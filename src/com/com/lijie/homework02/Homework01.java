package com.com.lijie.homework02;

class Point {
    int x, y;

    void setXY(int m, int n) {
        x = m;
        y = n;
    }
}

public class Homework01 {
    //4.3节，第四章例子3
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();

        System.out.println("P1的引用: " + p1);
        System.out.println("P2的引用: " + p2);
        p1.setXY(1111, 2222);
        p2.setXY(-100, -200);
        System.out.println("pl 的x,y坐标：" + p1.x + "," + p1.y);
        System.out.println("p2 的x,y坐标:" + p2.x + "," + p2.y);
        p1 = p2;
        System.out.println("将p2的引用赋给p1后：");
        System.out.println("p1 的引用：" + p1);
        System.out.println("p2 的引用：" + p2);
        System.out.println("p1 的x,y坐标:"+ p1.x + "," + p1.y);
        System.out.println("p2 的x,y坐标："+ p2.x + "," + p2.y);
    }
}
