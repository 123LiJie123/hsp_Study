package com.com.lijie.homework02;
import java.util.*;
public class Homework03{
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        double radius=input.nextDouble();
        while(true)
        {
            if(radius>=0)
            {
                Circle1 circle1= new Circle1();
                System.out.println("面积为："+String.format("%.2f",circle1.Area(radius)));
                System.out.println("周长为："+String.format("%.2f",circle1.calPerimeter(radius)));
                return;

            }
            else{
                System.out.println("input error!please try again");
            }
        }
    }


}
class Circle1{
    private double radius;
    Circle1(){

    }
    void setRadius(){
        this.radius=radius;
    }
    public double getRadius(double radius){
        return radius;
    }
    double Area(double radius){
        return Math.PI*radius*radius;
    }
    double calPerimeter(double radius){
        return	2*Math.PI*radius;
    }

}