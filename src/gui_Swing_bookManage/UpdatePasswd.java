package gui_Swing_bookManage;


import gui_Swing_bookManage.mysql.Database;
import gui_Swing_bookManage.object.User;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

//管理员页面子页面修改添加用户
public class UpdatePasswd {


    public static JDesktopPane jDesktopPane = new JDesktopPane();//主页面  主面板
    private static String[] columnNames = new String[]{"用户名", "密码", "权限"};
    private static JPanel panel = new JPanel();//子页面内容面板
    //        panel.setLayout(new BorderLayout());//设置布局
    private static JTable t = null;

    private static JLabel label = new JLabel("用户名：");
    private static JButton button = new JButton("查询");
    private static JTextField field = new JTextField(12);
    private static JScrollPane jScrollPane = new JScrollPane(t);

    private static JPanel panel2 = new JPanel();
    private static JLabel jLabel = new JLabel("用户名");//用户名
    private static JTextField jTextField = new JTextField(12);//用户名文本框
    private static JLabel jLabel1 = new JLabel("密码");//密码
    private static JPasswordField passwordField = new JPasswordField(12);//密码框

    private static JButton jButton = new JButton("添加用户");
    private static JButton jButton1 = new JButton("删除用户");
    private static JLabel jLabel2 = new JLabel("用户权限");//用户权限
    private static Object[] arr = {"普通用户", "管理员用户"};
    private static JComboBox jComboBox = new JComboBox(arr);
    private static JInternalFrame internalFrame = new JInternalFrame("修改密码", true, true, true, true);
    private static JPanel panel1 = new JPanel();

    public static void Update(JFrame frame) {


        internalFrame.setSize(800, 500);//设置窗口大小
        t = null;
        internalFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//关闭按钮
        internalFrame.setLayout(new BorderLayout());//设置子页面布局
        List<User> users = Database.SelectUser();//调用数据库查询数据
        String[][] heros = new String[users.size()][3];
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            heros[i][0] = user.getUser();
            heros[i][1] = user.getPasswd();
            if (user.getJudge() == 1) {
                heros[i][2] = "管理员用户";
            } else {
                heros[i][2] = "普通用户";
            }
        }
        t = new JTable(heros, columnNames);
        jScrollPane = new JScrollPane(t);
        panel1.add(jScrollPane);
        internalFrame.updateUI();

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                panel1.remove(jScrollPane);
                String text = field.getText();
                List<User> users = Database.SelectUser(text);//调用数据库查询数据
                String[][] heros = new String[users.size()][3];
                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    heros[i][0] = user.getUser();
                    heros[i][1] = user.getPasswd();
                    if (user.getJudge() == 1) {
                        heros[i][2] = "管理员用户";
                    } else {
                        heros[i][2] = "普通用户";
                    }
                }
                t = new JTable(heros, columnNames);
                jScrollPane = new JScrollPane(t);
                panel1.add(jScrollPane);
                internalFrame.updateUI();
            }
        });


        panel2.setLayout(new FlowLayout());
        panel2.add(jLabel);//用户名
        panel2.add(jTextField);//用户名文本框

        panel2.add(jLabel1);//密码
        panel2.add(passwordField);//密码文本框
        panel2.add(jLabel2);//用户权限
        panel2.add(jComboBox);//下拉列表
        panel2.add(jButton1);//删除用户
        panel2.add(jButton);//添加用户
        internalFrame.add(panel2, BorderLayout.SOUTH);

        panel1.add(jScrollPane);
        int defaultCloseOperation = internalFrame.getDefaultCloseOperation();
        System.out.println(defaultCloseOperation);
        // 表格上的title
        panel.add(label);
        panel.add(field);
        panel.add(button);
        internalFrame.add(panel, BorderLayout.NORTH);//窗口添加面板
        internalFrame.add(panel1, BorderLayout.CENTER);//添加表格到面板中间

        jDesktopPane.add(internalFrame);   //讲子页面，添加到主面板
        frame.add(jDesktopPane, BorderLayout.CENTER);  //讲主面板添加到页面中
        internalFrame.setVisible(true);     //字面显示状态为true
        //刷新页面
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = jTextField.getText();
                String passwd = passwordField.getText();
                int Index = jComboBox.getSelectedIndex();
                Boolean aBoolean = Database.RemoveUser(text, passwd, Index);
                if (aBoolean) {
                    JOptionPane.showMessageDialog(panel2, "恭喜你，删除用户成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel2, "抱歉，删除用户失败", "警告", JOptionPane.ERROR_MESSAGE);
                }
                internalFrame.updateUI();
            }
        });
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = jTextField.getText();
                String passwd = passwordField.getText();
                int Index = jComboBox.getSelectedIndex();
                Boolean aBoolean = Database.AddUser(text, passwd, Index);
                if (aBoolean) {
                    JOptionPane.showMessageDialog(panel2, "恭喜你，用户注册成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel2, "抱歉，用户注册失败", "警告", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        SwingUtilities.updateComponentTreeUI(Head.frame);
    }

}