package com.hansunping_Obj.inner_class;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        InnerClassExercise01.f1(new AA() {
            @Override
            public void show() {
                System.out.println("这是一副名画");
            }
        });

    }
    //静态方法，形参是接口类型
    public static void f1(AA a) {
        a.show();
    }
}

interface AA {
    void show();
}


