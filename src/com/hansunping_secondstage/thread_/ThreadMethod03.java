package com.hansunping_secondstage.thread_;

public class ThreadMethod03 {
    public static void main(String[] args) {
        MydaemonThread dt = new MydaemonThread();
        //设置守护线程
        /*
        将dt设置为守护线程，当所有线程结束后，dt也就自动结束
        如果没有设置，那么即使main线程执行完毕，dt也不退出
         */
        dt.setDaemon(true);
        dt.start();

        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(50);
                System.out.println("辛苦工作~~~~~" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MydaemonThread extends Thread {
    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("快乐聊天，哈哈哈哈~~~");
        }
    }
}



