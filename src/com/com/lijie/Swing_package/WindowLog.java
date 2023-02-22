package com.com.lijie.Swing_package;

import javax.swing.*;
import java.awt.*;

public class WindowLog extends JFrame{
    void init(){
        Box vBox_1= Box.createVerticalBox();
        Box vBox_2= Box.createVerticalBox();
//        Box vBox_3 = Box.createHorizontalBox();
        Box baseBox = Box.createHorizontalBox();


        setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("账号：");
        vBox_1.add(jLabel);
        vBox_1.add(Box.createVerticalStrut(2));

        JLabel jLabel_1 = new JLabel("密码：");
        vBox_1.add(jLabel_1);
        vBox_1.add(Box.createVerticalStrut(2));

        JTextField text = new JTextField(10);
        vBox_2.add(text);
        vBox_2.add(Box.createVerticalStrut(2));

        JTextField text2 = new JTextField(10);
        vBox_2.add(text2);
        vBox_2.add(Box.createVerticalStrut(2));


        JButton button_1 = new JButton("确认");
        JButton button_2 = new JButton("取消");
        vBox_1.add(button_1);
        vBox_2.add(button_2);



//        JTextField text = new JTextField(10);
//        add(text);
//        JLabel jLabel_1 = new JLabel("密码：");
//        add(jLabel_1);
//        vBox_1.add(jLabel_1);
//        JTextField text_2 = new JTextField(10);
//        add(text_2);
//        JButton button = new JButton("确定");
//        add(button);

        baseBox.add(vBox_1);
        baseBox.add(vBox_2);
        add(baseBox);

    }

    public WindowLog(){
        init();
        setVisible(true);

    }
}
