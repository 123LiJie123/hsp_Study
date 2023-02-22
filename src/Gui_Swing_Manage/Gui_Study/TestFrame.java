package Gui_Swing_Manage.Gui_Study;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个java图形界面窗口");


        //设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 400);

        //设置窗口背景颜色

        frame.setBackground(new Color(205, 45, 114));

        frame.setLocation(200, 200);

        //设置大小不变
        frame.setResizable(true);

    }
}


class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame" + (++id));
        setBounds(x, y, w, h);
        setBackground(color);
        setVisible(true);
    }


}
