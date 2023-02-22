package com.hansunping_Obj.extend;

public class Extends_practice {
    public static void main(String[] args) {

        /*
        编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回Computer详细信息。

        编写NotePad子类,继承Computer类，添加特有属性【演示color】
        编写Test类，在main方法中创建PC和NotePad对象，分
        别给对象中特有的属性赋值,以及从Computer类继承的属性赋值，并使用方法并打印输出信息。
         */

        PC pc = new PC("华硕","120G","硬盘");
        NotePad notePad = new NotePad("苹果","120G","硬盘");
        pc.setBrand("联想");
        notePad.setColor("白色");

        System.out.println(pc.getDetails());
        System.out.println(notePad.getDetails());



    }
}


class Computer{
    String CPU,neicun,yingpan;
    public Computer(String CPU, String neicun, String yingpan) {
        this.CPU = CPU;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getDetails(){
        return "CPU:"+CPU+"内存："+neicun+"yingpan: "+yingpan;
    }
}

class PC extends Computer{
    String brand;  //特有属性:品牌
    public PC(String CPU, String neicun, String yingpan) {
        super(CPU, neicun, yingpan);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "CPU:"+CPU+"内存："+neicun+"yingpan: "+yingpan+"品牌："+brand;
    }
}

class NotePad extends Computer{
    String color;   //特有属性:颜色
    public NotePad(String CPU, String neicun, String yingpan) {
        super(CPU, neicun, yingpan);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getDetails() {
        return "CPU:"+CPU+"内存："+neicun+"yingpan: "+yingpan+"颜色："+color;
    }
}
