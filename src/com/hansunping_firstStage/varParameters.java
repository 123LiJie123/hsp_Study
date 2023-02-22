package com.hansunping_firstStage;

public class varParameters {
    public static void main(String []args){
        HasMethod m = new HasMethod();
        m.sum();
        m.sum(1,2,3);
    }
}

class HasMethod{
    //1. int... 表示接受的是可变参数，类型是int,即可以接收多个int(0-多)
    //2.使用可变参数时，可以当做数组来使用，即nums可以当做数组
    public int sum(int ...nums) {
      int sum = 0;   // 局部变量不初始化为随机值故需要初始化
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
        return sum;
    }

    //3.细节：使用可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    public void f2(double str,double... nums){

    }

}

