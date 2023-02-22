package gui_Swing_bookManage;

        import gui_Swing_bookManage.mysql.Database;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.awt.event.MouseListener;

/**
 * 注册页面
 */
public class register {
    //创建子页面
    public static void Subpage(JFrame jFrame) {
        JDialog jDialog = new JDialog(jFrame, "注册页面", true);//设置由谁弹出，名字，鼠标选中对话框时不能对其他对话框改变
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel(new FlowLayout());
        panel.setLayout(null);

        panel.setBackground(new Color(0xe7fafe));

        ImageIcon icon = new ImageIcon("src/GUI_Object/images/RegisterLogo.jpg");
        JLabel textStudentManage = new JLabel(icon);//创建一个标签,并命名为“学生管理系统“
        textStudentManage.setBounds(0, 0, 900, 90);//设置标签的绝对位置
        panel.add(textStudentManage);
        //用户名
        JLabel name = new JLabel("用户名：");
        name.setForeground(new Color(0xa5d478));
        name.setFont(new Font("黑体", Font.PLAIN, 30));
        name.setBounds(200, 140, 200, 100);
        panel.add(name);

        //用户输入框
        JTextField NameField = new JTextField(12);
        NameField.setFont(new Font("黑体", Font.PLAIN, 18));
//        NameField.setSelectedTextColor(new Color(0xFF0000));
        NameField.setBounds(330, 170, 280, 40);
        panel.add(NameField);


        //标签密码
        JLabel passwd = new JLabel("密码：");
        passwd.setForeground(new Color(0xa5d478));
        passwd.setFont(new Font("黑体", Font.PLAIN, 30));
        passwd.setBounds(200, 200, 200, 100);
        panel.add(passwd);

        //密码框
        JPasswordField passwordField = new JPasswordField(12);
        passwordField.setBounds(330, 230, 280, 40);
        panel.add(passwordField);


        //下拉列表

        Object[] arr = {"普通用户", "管理员用户"};
        JLabel label = new JLabel("用户权限：");
        label.setForeground(new Color(0xa5d478));
        label.setFont(new Font("黑体", Font.PLAIN, 30));
        label.setBounds(200, 260, 200, 100);
        JComboBox jComboBox = new JComboBox(arr);
        jComboBox.setBounds(340, 290, 80, 40);
        panel.add(label);
        panel.add(jComboBox);


        //确认按钮

        JButton register = new JButton("确认");
        register.setForeground(new Color(0xa5d478));
        register.setBackground(new Color(0xfffed5));
        register.setFont(new Font("黑体", Font.PLAIN, 20));
        register.setBorderPainted(false);
        register.setBounds(430, 290, 80, 40);
        panel.add(register);
//        JButton button = new JButton("确认");
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = 10;
                i = JOptionPane.showConfirmDialog(panel, "您确认注册用户吗？");
                if (i == 0) {
                    String text = NameField.getText();
                    String password = passwordField.getText();
                    int selectedIndex = jComboBox.getSelectedIndex();//获取选到的下拉向
                    Boolean aBoolean = Database.AddUser(text, password, selectedIndex);
                    if (aBoolean) {
                        JOptionPane.showMessageDialog(panel, "恭喜你，用户注册成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                        jDialog.setVisible(false);
                        jFrame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(panel, "抱歉，用户注册失败", "警告", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        //返回键
        JButton register1 = new JButton("返回");
        register1.setForeground(new Color(0xfddfeb));
        register1.setBackground(new Color(0x84d696));
        register1.setFont(new Font("黑体", Font.PLAIN, 20));
        register1.setBorderPainted(false);
        register1.setBounds(0, 0, 80, 40);
        register1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jDialog.setVisible(false);
                jFrame.setVisible(true);
            }
        });
        panel.add(register1);


        jDialog.add(panel);//新页面
        jFrame.setVisible(false);
        Head.initJDialog(jDialog);

    }
}