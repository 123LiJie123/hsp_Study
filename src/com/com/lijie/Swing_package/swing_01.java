package com.com.lijie.Swing_package;

import javax.swing.*;
import java.awt.*;

public class swing_01 {
    public static void main(String[] args) {
        JFrame window01 = new JFrame("第一个窗口");

        JFrame window2 = new JFrame("第二个窗口");
        Container con = window01.getContentPane();   //获取窗口事件的始发者
        con.setBackground(Color.yellow);     //使用事件的始发者设置窗口的颜色

        window01.setBounds(60,100,188,108);
        window2.setBounds(260,100,168,108);


        window01.setVisible(true);
        window2.setVisible(true);

        window01.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


    }
}
