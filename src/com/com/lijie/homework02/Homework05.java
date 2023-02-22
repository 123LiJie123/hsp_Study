package com.com.lijie.homework02;

public class Homework05 {
    public static void main(String[] args){
        Point01 pt=new Point01(1,2);
        System.out.println("x的值是"+pt.getX()+"y的值是"+pt.getY());
    }

}
class Point01{
    private int x;
    private int y;

    Point01(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return	y;
    }
}