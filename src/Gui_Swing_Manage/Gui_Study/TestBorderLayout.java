package Gui_Swing_Manage.Gui_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorderLayout {
    public static void main(String[] args) {
        //东西南北中布局

        Frame frame = new Frame("东西南北中");
        Button east = new Button("east");//东
        Button west = new Button("west");//西
        Button south = new Button("south");//南
        Button north = new Button("north");//北
        Button center = new Button("center");//中


        frame.setBounds(500, 100, 500, 500);

        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
