package com.hansunping_secondstage.thread_;

public class ThreadState_ {
    public static void main(String[] args) {
        T03 t03 = new T03();

        System.out.println(t03.getState());     //输出t03的状态

        t03.start();

        while (Thread.State.TERMINATED != t03.getState()) {
            System.out.println(t03.getState());     //输出t03的状态
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(t03.getState());
    }
}


class T03 extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
