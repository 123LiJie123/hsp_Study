package com.tankgame_.tankgame1_0;

public class Hero extends Tank {
    Bullet bullet = null;
    boolean isLive = true;

    public void setLive(boolean live) {
        isLive = live;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public Hero(int x, int y)  {
        super(x, y);
    }

    public void shot() {
        switch (getDirect()) {
            case 0:
                bullet = new Bullet(getX() + 20, getY(), 0);
                break;
            case 1:
                bullet = new Bullet(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                bullet = new Bullet(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                bullet = new Bullet(getX(), getY() + 20, 3);
                break;
        }

        bullet.start();
    }
}
