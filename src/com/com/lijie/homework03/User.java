package com.com.lijie.homework03;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100,100);
        System.out.println("此时车速为："+vehicle.getSpeed()+"此时功率为："+vehicle.getPower());  //获取功率和车速


        String s;
        Scanner scanner = new Scanner(System.in);
        double up;
        double down;
        int power;

        System.out.println("请根据需要输入\n---- 加速 ------\n---- 减速 ----\n----设置功率----\n----结束操作----");
        while(true){
            s = scanner.next();
            //设置功率
            if (s.equals("设置功率") ){
                System.out.println("请输入设置的功率：");
                power = scanner.nextInt();
                vehicle.setPower(power);
                System.out.println("设置后的功率为："+vehicle.getPower());
            }else if (s.equals("加速") ){
                //加速
                System.out.println("请输入加速多少：");
                up = scanner.nextDouble();
                vehicle.speedUp(up);
                System.out.println("加速后速度为"+vehicle.getSpeed());
            }else if (s.equals("减速")){
                //减速
                System.out.println("请输入需要减速多少：");
                down = scanner.nextDouble();
                vehicle.speedDown(down);
                System.out.println("减速后速度为"+vehicle.getSpeed());
            }else if (s.equals("结束操作")){
                System.out.println("操作已结束。。。。。");
                return;
            }





        }


    }

}
