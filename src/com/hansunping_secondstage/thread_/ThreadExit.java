package com.hansunping_secondstage.thread_;

public class ThreadExit {
    //启动一个线程t,要求在main线程中去停止线程t
    public static void main(String[] args) {
        T t = new T();
        t.start();

        //如果希望main线程去控制t1线程的终止，必须可以修改loop

        while (t.getCount() <= 100) {
            t.setCount(t.getCount() + 1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getCount());
        }
        if (t.getCount() >= 100) {
            t.setLoop(false);
        }
    }
}


class T extends Thread {
    //定义一个控制变量
    private int count = 0;
    private boolean loop = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中……");
        }
    }
}
