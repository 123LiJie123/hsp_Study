package com.hansunping_secondstage.thread_;

public class ThreadMehod02 {
    public static void main(String[] args) throws InterruptedException {

        T02 t02 = new T02();
        t02.start();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i + "个包子");

            if (i > 5) {
                System.out.println("主线程让子线程先吃");
//                t02.join();  //让t02线程先执行完毕

                Thread.yield();
            }


        }

    }
}


class T02 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {


            try {

                Thread.sleep(1000);  //休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程吃了" + i + "个包子");
        }


    }
}