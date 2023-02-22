package com.hansunping_Obj.test;

public class practice_eightqueens {
    /*
       八皇后问题
       八皇后问题，是一个古老而著名的问题，是回溯算法的典型案例。该问题是国际西洋棋棋手马克斯 贝瑟尔于1848年提出：
       在8x8格的国际象棋上摆放八个皇后，使其不能互相攻击，即：任意两个皇后不能处于同一行、同一列或同一斜线上，问有多少种摆法。

       思路分析：
       1、第一个皇后先放第一行第一列
       2、第二个皇后放在第二行第一列、然后判断是否OK，如果不OK，继续放在第二列、第三列、依次把所有列都放完，找到一个合适
       3、继续第三个皇后，还是第一列、第二列……直到第8个皇后也放在一个不冲突的位置，算是找到一个正确解
       4、当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第一个皇后，放到第一列的所有正确解，全部得到。
       5、然后回头继续第一个皇后放第二列，后面继续循环执行1，2，3，4的步骤

       说明：理论上应该创建一个二维数组来表示棋盘，但是实际上可以通过算法，用一个一维数组即可解决问题. arr[8] = {0,4,7,5,2,6,1,3}
       对应arr下标表示第几行，即第几个皇后，arr[i] = val, val表示第i+1个皇后，放在第i+1行的第val+1列。
        */
    public static void main(String[] args) {
        final int N = 8;
        int [] arr = new int[8];


    }

    public void printf(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public boolean judge(int n, int []arr){

        for (int i = 0; i < n; i++) {
            //判断是否在同一竖线上或者是否在同一斜线上
            if (arr[n] == arr[i]||Math.abs(n-i)==Math.abs(arr[n]-arr[i])){
                return false;
            }
        }

        return true;

    }


    public void put(int n, int []arr){
        if (n==8){
            printf(arr);
            return;
        }
        for (int i = 0; i < 8; i++) {
           arr[n] = i;
           if (judge(n,arr)){
                put(n+1,arr);
           }

        }
    }
}
