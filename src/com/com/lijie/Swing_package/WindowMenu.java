package com.com.lijie.Swing_package;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class WindowMenu extends JFrame {
    JMenuBar menuBar;
    JMenu menu,subMenu;
    JMenuItem item1,item2;
    public WindowMenu(){

    }
    public WindowMenu(String s,int x,int y, int w, int h ){
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    void init(String s){
        setTitle(s);    //窗口名
        menuBar = new JMenuBar();    //JMenuBar负责创建菜单条 它的实例就是一个菜单条
        menu = new JMenu("菜单");     //JMenu负责创建菜单，它的实例就是一个菜单
        subMenu = new JMenu("子菜单");
//        item1 = new JMenuItem("菜单项1",new ImageIcon("a.gif"));  //负责创建菜单项，它的一个实例就是一个菜单项
        item2 = new JMenuItem("菜单项2",new ImageIcon("a.gif"));
//        item1.setAccelerator(KeyStroke.getKeyStroke('A'));
//        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menu.add(item1);   //填装item1
//        menu.addSeparator();
//        menu.add(item2);
//        menu.add(subMenu);
//        subMenu.add(new JMenuItem("子菜单里的菜单项", new ImageIcon("c.gif")));
        menuBar.add(menu);


        setJMenuBar(menuBar);     //将菜单条放置到窗口中
    }
}
