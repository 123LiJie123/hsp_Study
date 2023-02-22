package gui_Swing_bookManage;

import gui_Swing_bookManage.mysql.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//图书管理系统管理员界面
public class LibraryManager {
    private static JDesktopPane jDesktopPane2 = UpdatePasswd.jDesktopPane;//主页面  主面板
    private static JInternalFrame LibraryFrame = new JInternalFrame("图书修改", true, true, true, true);
    private static final int Size = 12;

    private static JPanel panel = new JPanel();
    private static JLabel label = new JLabel("图书序号:");
    private static JTextField text = new JTextField(Size);

    private static JPanel panel1 = new JPanel();
    private static JLabel label1 = new JLabel("作   者:");
    private static JTextField text1 = new JTextField(Size);

    private static JPanel panel2 = new JPanel();
    private static JLabel label2 = new JLabel("书   名:");
    private static JTextField text2 = new JTextField(Size);

    private static JPanel panel3 = new JPanel();
    private static JLabel label3 = new JLabel("价   格:");
    private static JTextField text3 = new JTextField(Size);

    private static JPanel panel4 = new JPanel();
    private static JLabel label4 = new JLabel("出 版社:");
    private static JTextField text4 = new JTextField(Size);

    private static JPanel panel5 = new JPanel();
    private static JLabel label5 = new JLabel("出版时间:");
    private static JTextField text5 = new JTextField(Size);

    private static JPanel panel6 = new JPanel();
    private static JLabel label6 = new JLabel("库存数量:");
    private static JTextField text6 = new JTextField(Size);

    private static JPanel panel7 = new JPanel();
    private static JLabel label7 = new JLabel("分   类:");
    private static Object[] book = {"小说", "长篇小说", "传记", "政治", "伦理", "逻辑", "文学"};
    private static JComboBox bookcombobox = new JComboBox(book);

    private static JButton button = new JButton("添加");
//    private static JButton button1 = new JButton("删除");

    private static Box box = Box.createHorizontalBox();
    private static Box box2 = Box.createHorizontalBox();
    private static Box box3 = Box.createHorizontalBox();
    private static Box box4 = Box.createHorizontalBox();
    private static Box box5 = Box.createHorizontalBox();
    private static Box box12 = Box.createVerticalBox();

    public static void Library() {
        LibraryFrame.setLayout(new BorderLayout());//设置子页面布局                  LibraryFrame弹出页面
        jDesktopPane2.add(LibraryFrame);//                                         jDesktopPane2中间面板
        Head.frame.add(jDesktopPane2, BorderLayout.CENTER);
        panel.add(label);
        panel.add(text);
        panel1.add(label1);
        panel1.add(text1);
        box.add(panel);
        box.add(panel1);

        panel3.add(label3);
        panel3.add(text3);
        panel2.add(label2);
        panel2.add(text2);
        box2.add(panel2);
        box2.add(panel3);

        panel4.add(label4);
        panel4.add(text4);
        panel5.add(label5);
        panel5.add(text5);
        box3.add(panel4);
        box3.add(panel5);

        panel6.add(label6);
        panel6.add(text6);
        panel7.add(label7);
        panel7.add(bookcombobox);
        box4.add(panel6);
        box4.add(panel7);

        box5.add(button);
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texts = text.getText();
                String texts1 = text1.getText();
                String texts2 = text2.getText();
                String texts3 = text3.getText();
                String texts4 = text4.getText();
                String texts5 = text5.getText();
                String texts6 = text6.getText();
                String texts7 = (String) bookcombobox.getSelectedItem();

                Boolean b = Database.AddBook(texts, texts1, texts2, texts3, texts4, texts5, texts6, texts7);
                if (b) {
                    JOptionPane.showMessageDialog(box5, "恭喜你，图书添加成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(box5, "抱歉，图书添加失败", "警告", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button.setSize(100, 50);
//        box5.add(button1);


        box12.add(box);
        box12.add(box2);
        box12.add(box3);
        box12.add(box4);
        box12.add(box5);
        LibraryFrame.add(box12, BorderLayout.CENTER);

        JPanel jPanel = new JPanel(new FlowLayout());
        JLabel jLabel = new JLabel("图书添加");
        jLabel.setFont(new Font("黑体", Font.PLAIN, 50));
        jLabel.setForeground(new Color(0XFFAEB9));//设置字体颜色

        jPanel.add(jLabel);
        LibraryFrame.add(jPanel, BorderLayout.NORTH);

        LibraryFrame.setSize(800, 500);//设置窗口大小
        LibraryFrame.setVisible(true);
        LibraryFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//关闭按钮
        LibraryFrame.updateUI();

        SwingUtilities.updateComponentTreeUI(Head.frame);
    }

}
