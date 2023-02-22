package com.com.lijie.homework03;

public class Vehicle {
    private double speed;   //速度
    private int power;     // 功率

    public Vehicle(double speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public void speedUp(double up){   //加速
        this.speed = this.speed + up;
    }

    public void speedDown(double down){   //减速
        this.speed = this.speed - down;
    }

    public void setPower(int power) {   //设置功率
        this.power = power;
    }

    public double getSpeed(){    //获取速度
     return this.speed;
    }

    public int getPower(){    //获取功率
        return this.power;
    }
}
