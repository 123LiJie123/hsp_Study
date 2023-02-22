package com.hansunping_secondstage.thread_;

public class ThreadMethod01 {
    public static void main(String[] args) {

        T01 t01 = new T01();
        t01.setName("老韩");
        t01.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t01.getName());


        t01.start();


        //让主线程打印5个hi,然后我就中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t01.interrupt();
    }
}


class T01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "吃包子了~~~~" + i);
        }

        try {
            System.out.println(Thread.currentThread().getName() + "休眠中");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            //当该线程执行到一个interrupt方法时，就会catch一个异常，可以加入自己的业务代码
            System.out.println(Thread.currentThread().getName() + "休眠被interrupt了");
        }
    }
}
