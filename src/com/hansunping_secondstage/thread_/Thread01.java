package com.hansunping_secondstage.thread_;

public class Thread01 {
    /*
    （1）请编写程序，开启一个线程，该线程每隔1秒。在控制台输出 “喵喵，我是小猫咪”。
    （2）对上题改进：当输出80次喵喵，我是小猫咪，结束该线程
    （3）使用JConsol监控线程执行情况，并画出程序示意图！
     */

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();       //启动线程
        Cat cat1 = new Cat();
        cat1.start();
        Dog dog = new Dog();
        new Thread(cat).start();


        System.out.println("主线程继承执行" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程i=" + i);
            //让主线程休眠

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}


class Cat extends Thread {
    //1、当一个类继承了Thread类，该类就可以当作线程使用。
    //2、我们会重写run方法，写上自己的业务代码
    //3、run Thread类 实现了Runnable接口的run方法
    @Override
    public void run() {  //重写run方法，写上自己的业务逻辑
        //该线程每隔1秒。在控制台输出 “喵喵，我是小猫咪”
        int i = 0;
        while (i < 80) {
            System.out.println("喵喵，我是小猫咪" + i + "线程名=" + Thread.currentThread().getName());
            //让线程休眠1秒
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Dog implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 80) {
            System.out.println("汪汪，我是小狗" + i + "线程名=" + Thread.currentThread().getName());
            //让线程休眠1秒
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
