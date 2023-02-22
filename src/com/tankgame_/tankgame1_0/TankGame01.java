package com.tankgame_.tankgame1_0;

import javax.swing.*;

public class TankGame01 extends JFrame {
    public TankGame01() {
        MyPanel myPanel = new MyPanel();
        new Thread(myPanel).start();
        this.setBounds(550, 200, MyPanel.WIDTH, MyPanel.WIDTH);
        this.setSize(MyPanel.WIDTH, MyPanel.WIDTH);
//        this.getContentPane().add(myPanel);
        this.add(myPanel);

        this.addKeyListener(myPanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

}
