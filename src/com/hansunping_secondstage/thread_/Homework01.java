package com.hansunping_secondstage.thread_;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {
    /*
    （1）在main方法中启动两个线程
    （2）第1个线程循环随机打印100以内的整数
    （3）直到第2个线程从键盘读取了“Q”命令。
     */

    public static void main(String[] args) {
        A01 a01 = new A01();
        A02 a02 = new A02();
        Thread thread1 = new Thread(a02);

        Thread thread = new Thread(a01);
        thread.setDaemon(true);
        thread.start();
        thread1.start();

    }
}


class A01 implements Runnable {
    static boolean loop = true;

    public static boolean isLoop() {
        return loop;
    }

    public static void setLoop(boolean loop) {
        A01.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            Random random = new Random();
            int a = random.nextInt(101);
            System.out.println(a);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class A02 implements Runnable {
    A01 a01 = new A01();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {

        while (true) {
            System.out.println("请输入你指令(Q)来使信息退出：");
            char Key = scanner.next().toUpperCase().charAt(0);

            if (Key == 'Q') {
                a01.setLoop(false);
                System.out.println("B线程退出。");
                break;
            }


        }
    }


}
