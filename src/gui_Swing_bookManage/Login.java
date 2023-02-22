package gui_Swing_bookManage;

import gui_Swing_bookManage.mysql.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
    private static Boolean Judge = true;

    //账户密码登录窗口loginWind
    public static void LoginWind() {


        JPanel panel = new JPanel();

        Head.frame.setBackground(new Color(0xFFF1C5));
        panel.setOpaque(false);
        panel.setLayout(new FlowLayout());

        panel.setLayout(null);
//        设置背景图片
        //添加标签【学生管理系统】
        ImageIcon imageIcon = new ImageIcon("src/GUI_Object/images/logo.jpg");
        JLabel textStudentManage = new JLabel(imageIcon);//创建一个标签,并命名为“学生管理系统“
        textStudentManage.setForeground(new Color(0XFFAEB9));//设置字体颜色
        textStudentManage.setFont(new Font("黑体", Font.PLAIN, 50));//设置字体大小
        textStudentManage.setBounds(0, 10, 900, 100);//设置标签的绝对位置
        panel.add(textStudentManage);//向框架中添加组件【标签(学生管理系统)】

        //添加标签【用户名】
        JLabel textUser = new JLabel("用户名:");
        textUser.setForeground(new Color(0Xdbb4f7));
        textUser.setFont(new Font("黑体", Font.PLAIN, 30));
        textUser.setBounds(200, 140, 200, 100);
        panel.add(textUser);

        //添加输入框【用户名输入框】
        JTextField user = new JTextField(20);
        user.setFont(new Font("黑体", Font.PLAIN, 18));
        user.setSelectedTextColor(new Color(0xFFF5EE));
        user.setBounds(330, 170, 280, 40);
        panel.add(user);

        //添加标签【密码】
        JLabel textPassword = new JLabel("密码  :");
        textPassword.setForeground(new Color(0x9BF732));
        textPassword.setFont(new Font("黑体", Font.PLAIN, 30));
        textPassword.setBounds(200, 200, 200, 100);
        panel.add(textPassword);

        //添加密码输入框【密码】
        JPasswordField password = new JPasswordField(20);
        password.setBounds(330, 230, 280, 40);
        panel.add(password);

        //添加按钮【登录】
        JButton jButton = new JButton("登录");
        jButton.setForeground(new Color(0xFF3620));
        jButton.setBackground(new Color(0xfffde4));
        jButton.setFont(new Font("黑体", Font.PLAIN, 20));
        jButton.setBorderPainted(false);
        jButton.setBounds(300, 330, 100, 50);
        panel.add(jButton);

        //添加按钮【注册】
        JButton register = new JButton("注册");
        register.setForeground(new Color(0xffcbe1));
        register.setBackground(new Color(0x80BAFF));
        register.setFont(new Font("黑体", Font.PLAIN, 20));
        register.setBorderPainted(false);
        register.setBounds(500, 330, 100, 50);
        panel.add(register);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = user.getText();//获取账户
                String passwd = password.getText();//获取密码
                int i = Database.QueryUser(name, passwd);
                switch (i) {
                    case 0:
                        JOptionPane.showMessageDialog(panel, "登录成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                        AverageUser.Subpage();
                        Head.UserName = name;
                        break;//普通用户登录页面
                    case 1:
                        JOptionPane.showMessageDialog(panel, "登录成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                        Admin.Subpage();
                        SwingUtilities.updateComponentTreeUI(Head.frame);
                        Head.UserName = name;
                        break;//管理员用户登录页面
                    default:
                        JOptionPane.showMessageDialog(panel, "警告密码或者账户输入错误", "警告", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
//        JButton button1 = new JButton("注册");
//        panel.add(button1);
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //创建页面2;
                if (Judge) {
                    Database.CreateAccount();
                    Judge = false;
                }
                gui_Swing_bookManage.register.Subpage(Head.frame);

            }
        });
        Head.frame.setContentPane(panel);
    }
}
