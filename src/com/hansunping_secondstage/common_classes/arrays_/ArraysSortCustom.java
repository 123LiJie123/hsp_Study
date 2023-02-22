package com.hansunping_secondstage.common_classes.arrays_;

import java.util.Comparator;

public class ArraysSortCustom {

    public static void main(String[] args) {
        int[] ints = {1, 13, 141, 235, 54};

//        bubble(ints);

        for (int i :
                ints) {
            System.out.print(i + "\t");
        }


        bubble02(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i1 = o2 - o1;
                return i1;
            }
        });
        System.out.println("\n排序后：");

        for (int i :
                ints) {
            System.out.print(i + "\t");
        }
    }

    //使用冒泡进行排序
    public static void bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

    }

    public static void bubble02(int[] a, Comparator<Integer> c) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (c.compare(a[j], a[j + 1]) > 0) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }


}
