package com.design_pattern.decoratePattern;

import java.io.Reader;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();



    }
}
