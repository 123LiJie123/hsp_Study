package com.hansunping_secondstage.thread_;

public class Thread03 {
    // main线程启动两个子线程
    public static void main(String[] args) {

        new Thread(new T1()).start();
        new Thread(new T2()).start();

    }
}


class T1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //每隔1秒输出“hello,world”，输出10次
            System.out.println("hello,world");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class T2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //每隔1秒输出“hi”，输出5次
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}