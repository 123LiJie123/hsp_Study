package gui_Swing_bookManage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 管理员登录页面
 */
public class Admin {
    public static void Subpage() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();//创建菜单栏的容器
        menuBar.setSize(900, 60);
        menuBar.setFont(new Font("黑体", Font.PLAIN, 60));
        menuBar.setBounds(0, 0, 900, 60);
        JMenu menu = new JMenu("用户管理");
        JMenu menu1 = new JMenu("图书管理");
        menuBar.add(menu);
        menuBar.add(menu1);
        JMenuItem item = new JMenuItem("添加修改用户密码");
        JMenuItem item2 = new JMenuItem("退出登录");
        JMenuItem item3 = new JMenuItem("添加图书");
        JMenuItem item4 = new JMenuItem("删除图书");
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Head.Update();

            }
        });

        item2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Login.LoginWind();
                SwingUtilities.updateComponentTreeUI(Head.frame);
            }
        });

        menu.add(item);
        menu.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        //添加图书
        item3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                LibraryManager.Library();
            }
        });
        //删除图书
        item4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                DropBook.Wind();
            }
        });

        item2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        jPanel.add(menuBar, BorderLayout.NORTH);
        Head.frame.setContentPane(jPanel);

    }
}

