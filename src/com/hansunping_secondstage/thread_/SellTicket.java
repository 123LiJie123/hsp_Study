package com.hansunping_secondstage.thread_;

public class SellTicket {
    //多线程售票问题


    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;  //让多个线程共享ticketNum
    static private boolean loop = true;

    @Override
    public void run() {   //同步方法，在同一时刻，只能有一个线程来执行run方法
        while (loop) {
            this.sell();
            //休眠50毫秒
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.println("售票结束……");
            loop = false;
            return;
        }
        System.out.println("窗口中线程名称：" + Thread.currentThread().getName() + "售出一张票"
                + "剩余票数" + (--ticketNum));

    }
}


class SellTicket03 implements Runnable {
    private static int ticketNum = 100;  //让多个线程共享ticketNum
    private boolean loop = true;
    Object object = new Object();

    @Override
    public void run() {
        while (loop) {
            this.sell();
            //休眠50毫秒
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void sell() {
        //可以在代码块上写synchronized，此时锁可以加在任意对象上。（但每个线程访问的对象都必须是同一个对象）
        synchronized (object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束……");
                loop = false;
                return;
            }
            System.out.println("窗口中线程名称：" + Thread.currentThread().getName() + "售出一张票"
                    + "剩余票数" + (--ticketNum));

        }
    }


}

