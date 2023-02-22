package com.hansunping_secondstage.enum_.homeworks_.homework08_;

import java.util.Scanner;

public class test {
     /*
    枚举类
        1.创建一个Color枚举类
        2、有RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对象;
        3. Color有三个属性redValue,greenValue,blueValue,
        4、创建构造方法，参数包括这三个属性，
        5．每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
        6. red: 255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
        7.定义接口，里面有方法show，要求Color实现该接口
        8. show方法中显示兰属性的值
        9.将枚举对象在switch语句中匹配使用
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color;


        while (true) {
            color = scanner.next();
            switch (color) {
                case "red":
                    Color.RED.show();
                    break;

                case "blue":
                    Color.BLUE.show();
                    break;
                case "black":
                    Color.BLACK.show();
                    break;
                case "yellow":
                    Color.YELLOW.show();
                    break;
                case "green":
                    Color.GREEN.show();
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }

        }

    }

}
