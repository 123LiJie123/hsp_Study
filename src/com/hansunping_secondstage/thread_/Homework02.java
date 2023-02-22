package com.hansunping_secondstage.thread_;

public class Homework02 {
    /*
    1、有2个用户分别从同一个卡上取钱（总额：10000）
    2、每次都取1000，当余额不足时，就不能取款了
    3、不能出现超取现象>线程同步问题
     */

    public static void main(String[] args) {
        Acount acount01 = new Acount();
        Acount acount02 = new Acount();
        acount01.start();
        acount02.start();

        while (true) {
            if (acount01.getState() == Thread.State.TERMINATED && acount02.getState() == Thread.State.TERMINATED) {
                System.out.println("账户1：" + acount01.balance);
                System.out.println("账户1：" + acount02.balance);
                System.out.println("卡：" + Card.balance);
                break;
            }
        }


    }


}


class Card {
    static int balance = 1000000;
}

class Acount extends Thread {
    int balance = 0;
    static Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            synchronized (obj) {
                if (Card.balance > 0) {
                    balance += 1000;
                    Card.balance -= 1000;
                    System.out.println(Thread.currentThread().getName() + "balance:" + balance);
                    System.out.println("Card.balance:" + Card.balance);
                }else {
                    break;
                }

            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }


    }
}



