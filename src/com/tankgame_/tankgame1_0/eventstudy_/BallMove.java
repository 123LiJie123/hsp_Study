package com.tankgame_.tankgame1_0.eventstudy_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel myPanel = null;

    /*
    演示小球通过键盘控制上下左右的移动---->讲解JAVA的事件控制
     */
    public static void main(String[] args) {
        new BallMove();
    }


    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setBounds(550, 200, 1000, 750);
        //窗口Jframe对象可以监听键盘事件，即可以监听到框架内发生的键盘事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}


//面板，可以画小球
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    //有字符输出时，该方法会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {

        //根据用户按下的不同键，来处理小球的移动（上下左右键）
        if (e.getKeyCode() == KeyEvent.VK_DOWN) { //下
            if (y<750){
                y++;
            }



        } else if (e.getKeyCode() == KeyEvent.VK_UP) {  //上
            if (y>0){
                y--;
            }


        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {  //左
            if (x>0){
                x--;
            }


        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {  //右

            if (x<962){
                x++;
                System.out.println(x);
            }

        }

        repaint();
    }

    //当某个键松开（释放），该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}