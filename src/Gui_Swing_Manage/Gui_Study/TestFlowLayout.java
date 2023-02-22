package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("流式布局");

        //设置一组按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");


        //设置流式布局
        frame.setLayout(new FlowLayout());  //默认布局是居中
//        frame.setLayout(new FlowLayout(new FlowLayout().LEFT));  //布局在左
//        frame.setLayout(new FlowLayout(new FlowLayout().RIGHT));  //布局在右


        //设置弹窗的位置和大小

        frame.setBounds(500, 100, 500, 500);


        frame.setVisible(true);

        frame.setBackground(new Color(35, 195, 182));


        //添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);


        //添加窗口的关闭监听

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
