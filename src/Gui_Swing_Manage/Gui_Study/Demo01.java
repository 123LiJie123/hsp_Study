package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo01 {
    public static void main(String[] args) {
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        Button btn7 = new Button("btn7");
        Button btn8 = new Button("btn8");
        Button btn9 = new Button("btn9");
        Button btn10 = new Button("btn10");

        Frame frame = new Frame("Demo");

        frame.setLayout(new GridLayout(2, 1));

        Panel panel_1 = new Panel();
        Panel panel_1_1 = new Panel();
        Panel panel_2 = new Panel();
        Panel panel_2_2 = new Panel();
        //设置上面的面板
        frame.add(panel_1);
        //设置下面的面板
        frame.add(panel_2);
        frame.setBounds(100, 500, 500, 500);
        frame.setVisible(true);

        panel_1.setLayout(new GridLayout(1, 3));  //上面面板的中间面板
        panel_2.setLayout(new GridLayout(1, 3));  //下面面板的中间面板

        panel_1_1.setLayout(new GridLayout(2, 1));
        panel_2_2.setLayout(new GridLayout(2, 2));
        panel_1_1.add(btn5);
        panel_1_1.add(btn6);

        panel_2_2.add(btn7);
        panel_2_2.add(btn8);
        panel_2_2.add(btn9);
        panel_2_2.add(btn10);


        panel_1.add(btn1);
        panel_1.add(panel_1_1);
        panel_1.add(btn2);

        panel_2.add(btn3);
        panel_2.add(panel_2_2);
        panel_2.add(btn4);

        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
