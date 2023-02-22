package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestInput {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setBounds(300, 100, 500, 500);

        frame.setBackground(new Color(52, 203, 185));

        //创建文本框
        TextField textField = new TextField();


        //添加文本框
        frame.add(textField, BorderLayout.NORTH);

        //文本框监听
        MyListener1 myListener1 = new MyListener1();

        textField.addActionListener(myListener1);


        //隐藏字符编码
        frame.setVisible(true);

        windowClose(frame);


    }

    public static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


//事件监听接口
class MyListener1 implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        //获得一些资源
        TextField textField = (TextField) e.getSource();

        System.out.println(textField.getText());

        textField.setText(""); //回车后清空
    }
}



