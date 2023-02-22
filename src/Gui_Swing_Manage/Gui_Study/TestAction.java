package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAction {
    public static void main(String[] args) {
        //按下按钮，触发一些事件

        Frame frame = new Frame("事件监听！");

        Button btn1 = new Button("I am a button!");

        frame.setBounds(500, 100, 500, 500);

        frame.setBackground(new Color(205, 239, 56));

        btn1.setBounds(600, 50, 100, 100);
        btn1.setBackground(new Color(0x12C894));
        frame.setVisible(true);

        MyListener myListener = new MyListener();

        btn1.addActionListener(myListener);

        frame.add(btn1, BorderLayout.CENTER);
        frame.pack();


        windowClose(frame);


    }

    //将关闭窗口抽象为静态方法
    public static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("干饭人干饭魂");
    }
}
