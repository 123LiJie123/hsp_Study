package com.tankgame_.tankgame1_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener, Runnable {
    public static int WIDTH = 900;
    public static int HEIGHT = 900;
    int direct = 0;

    //定义我的坦克
    Hero hero = null;

    Vector<EnemyTank> enemyTanks;
    //定义一个Vector，用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //定义三张炸弹图片，用于显示爆炸效果
    static Image image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));

    static Image image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));

    static Image image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.png"));


    public MyPanel() {


        hero = new Hero(100, 700);//初始化自己的坦克
        hero.setDirect(0);
        hero.setSpeed(2);

        //定义敌人坦克
        enemyTanks = new Vector<>();
        enemyTanks.add(new EnemyTank(80, 110));
        enemyTanks.add(new EnemyTank(160, 110));
        enemyTanks.add(new EnemyTank(240, 110));


        EnemyTank.setEnemyTanks(enemyTanks);
        for (int i = 0; i < enemyTankSize; i++) {
            new Thread(enemyTanks.get(i)).start();
        }


        //初始化图片对象


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        g.fillRect(0, 0, WIDTH, HEIGHT);//填充矩形，默认黑色

        if (hero != null && hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        } else {
            hero = null;
        }

        if (hero != null) {
            if (hero.getBullet() != null && hero.bullet.isLive()) {
                drawBullet(hero.getBullet().getX(), hero.getBullet().getY(), g, 1);

            }
        }


        for (int i = 0; i < enemyTanks.size(); i++) {
            if (enemyTanks.get(i).bullet != null && enemyTanks.get(i).bullet.isLive()) {
                drawBullet(enemyTanks.get(i).getBullet().getX(), enemyTanks.get(i).getBullet().getY(), g, 2);
            }
        }


        //判断敌方坦克是否还活着
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 2);
            } else if (enemyTank.isLive == false) {
                enemyTanks.remove(i);     //将被击中的坦克移除
            }

        }


        //如果bombs集合中有对象，就画出
        if (bombs.size() != 0) {
            for (int i = 0; i < bombs.size(); i++) {
                //取出炸弹
                Bomb bomb = bombs.get(i);
                //根据当前这个bomb对象的life值去画对应的图片
                if (bomb.life > 6) {
                    g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
                } else if (bomb.life > 3) {
                    g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
                } else {
                    g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //让这个炸弹的生命值减少
                bomb.lifeDown();
                //如果bomb life为0，就从bombs集合中删除
                if (bomb.life == 0) {
                    bombs.remove(i);
                }
            }
        }

    }

    public void drawBullet(int x, int y, Graphics g, int type) {
        switch (type) {
            case 1:
                g.setColor(Color.blue);
                break;
            case 2:
                g.setColor(Color.yellow);
        }
        g.draw3DRect(x, y, 2, 2, false);
    }


    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 1:   //我方坦克颜色
                g.setColor(Color.CYAN);
                break;
            case 2: //敌方坦克颜色
                g.setColor(Color.RED);
                break;
        }


        switch (direct) {   //根据坦克朝向去画坦克的
            case 0: //朝上
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);  //画出坦克左边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //画出坦克中间矩形
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);
                break;
            case 2: //朝下
                g.fill3DRect(x, y, 10, 60, false);  //画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);  //画出坦克左边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);  //画出坦克中间矩形

                g.fillOval(x + 10, y + 20, 20, 20);     //中间圆形
                g.drawLine(x + 20, y + 60, x + 20, y + 30);


                break;

            case 3:  //朝左
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);  //画出坦克左边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);  //画出坦克中间矩形

                g.fillOval(x + 20, y + 10, 20, 20);     //中间圆形
                g.drawLine(x + 30, y + 20, x, y + 20);

                break;
            case 1: //朝右
                g.fill3DRect(x, y, 60, 10, false);  //画出坦克左边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);  //画出坦克左边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);  //画出坦克中间矩形
                g.fillOval(x + 20, y + 10, 20, 20);     //中间圆形
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (hero != null) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                hero.setDirect(0);
                hero.moveUP();

            } else if (e.getKeyCode() == KeyEvent.VK_D) {
                hero.setDirect(1);
                hero.moveRight();
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                hero.setDirect(2);
                hero.moveDown();
            } else if (e.getKeyCode() == KeyEvent.VK_A) {
                hero.setDirect(3);
                hero.moveLeft();
            }

            if (e.getKeyCode() == KeyEvent.VK_J) {
                if (hero.bullet == null || hero.bullet.isLive() == false) {
                    hero.shot();
                }

            }
        }

//        for (int i = 0; i < enemyTanks.size(); i++) {
//            enemyTanks.get(i).setDirect(2);
//            if (enemyTanks.get(i).bullet == null || enemyTanks.get(i).bullet.isLive() == false) {
//
//                enemyTanks.get(i).shot();
//            }


//        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //判断是否击中了敌人坦克
            if (hero != null) {
                if (hero.bullet != null && hero.bullet.isLive()) {  //当我的子弹还存活
                    //遍历敌人所有的坦克

                    for (int i = 0; i < enemyTanks.size(); i++) {
                        EnemyTank enemyTank = enemyTanks.get(i);
                        hitEnemyTank(hero.bullet, enemyTank);


                        //如果enemytank是false时，将此坦克设置为false
                    }
                }
            }


            //判断是否击中了我方坦克
            for (int i = 0; i < enemyTanks.size(); i++) {
                if (enemyTanks.get(i).bullet != null && enemyTanks.get(i).bullet.isLive() && hero != null) {
                    hitHeroTank(enemyTanks.get(i).bullet, hero);
                }
            }


            for (int i = 0; i < enemyTanks.size(); i++) {
                if (enemyTanks.get(i).bullet == null || enemyTanks.get(i).bullet.isLive() == false) {

                    enemyTanks.get(i).shot();
                }


            }
        }


    }


    //击中敌方坦克

    public void hitEnemyTank(Bullet bullet, EnemyTank enemyTank) {


        //判断是否击中坦克
        switch (enemyTank.getDirect()) {
            case 0:  // 坦克向上
            case 2:   //坦克向下
                if (bullet.getX() >= enemyTank.getX() && bullet.getX() <= enemyTank.getX() + 40
                        && bullet.getY() >= enemyTank.getY() && bullet.getY() <= enemyTank.getY() + 60) {
                    bullet.setLive(false);
                    enemyTank.setLive(false);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;

            case 1:  //坦克向右
            case 3:  //坦克向左
                if (bullet.getX() >= enemyTank.getX() && bullet.getX() <= enemyTank.getX() + 60
                        && bullet.getY() >= enemyTank.getY() && bullet.getY() <= enemyTank.getY() + 40) {
                    bullet.setLive(false);
                    enemyTank.setLive(false);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);

                }


                break;
        }


    }


    //击中我方坦克存放炸弹的坐标信息
    public void hitHeroTank(Bullet bullet, Hero hero) {

        //判断是否击中坦克
        switch (hero.getDirect()) {
            case 0:  // 坦克向上
            case 2:   //坦克向下
                if (bullet.getX() >= hero.getX() && bullet.getX() <= hero.getX() + 40
                        && bullet.getY() >= hero.getY() && bullet.getY() <= hero.getY() + 60) {
                    bullet.setLive(false);
                    hero.setLive(false);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(hero.getX(), hero.getY());
                    bombs.add(bomb);
                }
                break;

            case 1:  //坦克向右
            case 3:  //坦克向左
                if (bullet.getX() >= hero.getX() && bullet.getX() <= hero.getX() + 60
                        && bullet.getY() >= hero.getY() && bullet.getY() <= hero.getY() + 40) {
                    bullet.setLive(false);
                    hero.setLive(false);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(hero.getX(), hero.getY());
                    bombs.add(bomb);

                }


                break;
        }
    }
}

