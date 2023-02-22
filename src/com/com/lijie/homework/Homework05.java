package com.com.lijie.homework;

public class Homework05 {
    public static void main(String[] args) {
        //do—while
        int i = 1;
        double sum = 0;


        do{
            int count = 1;
            for (int j = 1; j <= i; j++) {
                count = count * j;
            }
            sum = sum + 1.0/count;
            i++;

        }while (i <= 20 );

        System.out.println(sum);

         sum = 0;
        for (int j = 1; j <= 20; j++) {
          int  count = 1;
            for (int k = 1; k <= j; k++) {
                count = count * k;
            }
            sum = sum + 1.0/count;

        }
        System.out.println(sum);
    }
}
