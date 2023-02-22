package com.design_pattern.decoratePattern;


import java.io.BufferedWriter;
import java.io.Writer;

//创建实现了Shape接口的抽象装饰类
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;

    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
