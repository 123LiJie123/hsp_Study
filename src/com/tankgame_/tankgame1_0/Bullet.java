package com.tankgame_.tankgame1_0;

public class Bullet extends Thread {
    private int x;  //子弹x坐标
    private int y;  //子弹y坐标
    private int direct;  //坦克的炮筒方向
    private  int speed = 3; //设置子弹的速度
    private boolean isLive = true;   //判断子弹是否存活

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void run() {

        System.out.println("线程启动");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
            }


//            System.out.println(Thread.currentThread().getName() + "X:" + x + "Y:" + y);
            if ((x > MyPanel.HEIGHT || x < 0) ||(y > MyPanel.HEIGHT || y < 0 )|| !isLive) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }


        }

    }
}
