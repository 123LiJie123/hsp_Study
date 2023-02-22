package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//面板布局
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("我喜欢你");

        Panel panel = new Panel();

        frame.setLayout(null);

        frame.setBounds(500, 500, 500, 500);

        frame.setBackground(new Color(35, 195, 182));

        panel.setBounds(100, 100, 300, 300);
        panel.setBackground(new Color(17, 83, 183));

        frame.add(panel);


        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
