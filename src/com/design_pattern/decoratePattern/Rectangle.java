package com.design_pattern.decoratePattern;


//创建一个实现接口的实体类
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape：Rectangle");
    }
}
