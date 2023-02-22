package com.hansunping_firstStage;

import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
     double[]d = new double[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            d[i] = random.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(d[i]);
        }
     Homework01 h = new Homework01();
      System.out.println("最大值为："+h.findMax(d));

    }
    public double findMax(double[]doubles){
        double MAX;
        MAX = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > MAX){
                MAX = doubles[i];
            }
        }
        
        return MAX;
    }
}
