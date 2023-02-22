package com.hansunping_firstStage;

public class RecursionExercise01 {

    public static void main(String[]args){
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
        RecursionExercise01 exercise01 = new RecursionExercise01();
//        int sum = exercise01.fibonacci(1,1,N) + 1;
//
//        System.out.println(sum);

        int pea;

       pea =  exercise01.monkeyEatPea(1,1);

       System.out.println(pea);





    }
    public int fibonacci(int front,int rear,int N) {
        if (N == rear) {
            return N;
        } else {
            return fibonacci(rear,front + rear,N) + rear ;
        }

    }
/*
猴子吃桃问题：有一堆桃子，猴子第一天吃了其中一半，并再多吃一个！
以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，
想再吃时（即还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
 */

    public int monkeyEatPea(int pea,int day){


        if(day++==10){
            return pea;
        }else{
            return monkeyEatPea((pea+1)*2,day);
        }


    }
}


