package gui_Swing_bookManage;

import gui_Swing_bookManage.mysql.Database;
import gui_Swing_bookManage.object.Book;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class AverageUser {
    private static JFrame frame = new JFrame("普通用户界面");
    private static JDialog jDialog = new JDialog();
    private static JLabel panel1 = new JLabel();
    private static JPanel panel = new JPanel(new FlowLayout());

    //设置标题
    private static JLabel booktitle = new JLabel("普通用户界面");

    //设置书名
    private static JLabel booklabel = new JLabel("书名");
    private static String[] name = {"图书序号", "作者", "书名", "价格", "出版社", "出版时间", "库存数量", "分类"};
    private static JTextField bookfield = new JTextField(7);

    //设置作者
    private static JLabel autorlabel = new JLabel("作者");
    private static JTextField autorfield = new JTextField(5);

    //设置类别
    private static JLabel classlabel = new JLabel("类别");
    private static Object[] book = {"小说", "长篇小说", "传记", "政治", "伦理", "逻辑", "文学"};
    private static JComboBox bookcombobox = new JComboBox(book);

    //设置按钮
    private static JButton button = new JButton("查找");

    //设置背景图片
    private static ImageIcon imageIcon = new ImageIcon("D:\\java\\java项目\\untitled\\src\\image\\1.png");
    private static JLabel imagelabel = new JLabel(imageIcon);

    //设置表格
    private static JTable booktable = null;
    private static JScrollPane scrollPane = new JScrollPane(booktable);

    //借阅书籍
    private static JButton borrowbutton = new JButton("借阅书籍");
    //归还书籍
    private static JButton returnbutton = new JButton("归还书籍");
    //退出系统
    private static JButton quitbutton = new JButton("退出登录");
    private static JPanel panel2 = new JPanel();
    private static JPanel panel3 = new JPanel();

    public static void Subpage() {
        //标题
        frame.setLayout(new BorderLayout());
        booktitle.setFont(new Font("宋体", Font.PLAIN, 20));
        panel.add(booktitle);//标题标签
        //书名
        panel.add(booklabel);//书名标签
        panel.add(bookfield);//书名搜索框
        //作者
        panel.add(autorlabel);
        panel.add(autorfield);
        //类别

        panel.add(classlabel);
        panel.add(bookcombobox);
        //按钮
        panel.add(button);
        button.setBackground(Color.getHSBColor(212, 179, 204));
        //背景图片
//        panel.add(imagelabel);   //图片会默认显示在中间会覆盖掉一个容器，得把图片设置为背景，不能单独放到容器里面
        //表格
        panel3.add(scrollPane);
        //借阅书籍

        panel2.add(borrowbutton);
        //归还书籍
        panel2.add(returnbutton);
        //退出系统
        panel2.add(quitbutton);

        //查找
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String bookName = bookfield.getText();
                String text = autorfield.getText();
                String Item = (String) bookcombobox.getSelectedItem();
                panel3.remove(scrollPane);
                List<Book> books = Database.SelectBook(bookName, text, Item);
                Object[][] list = new Object[books.size()][8];
                for (int i = 0; i < books.size(); i++) {
                    Book book = books.get(i);
                    list[i][0] = book.getId();
                    list[i][1] = book.getAuthor();
                    list[i][2] = book.getName();
                    list[i][3] = book.getPages();
                    list[i][4] = book.getPrice();
                    list[i][5] = book.getTime();
                    list[i][6] = book.getSize();
                    list[i][7] = book.getType();
                }
                booktable = new JTable(list, name);
                scrollPane = new JScrollPane(booktable);

                panel3.add(scrollPane);
                SwingUtilities.updateComponentTreeUI(frame);
            }
        });


        //容器添加
        frame.add(panel, BorderLayout.NORTH);//容器中间
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.SOUTH);//容器顶端
        Head.frame.setVisible(false);
        Head.initFrame(frame);


        //退出登录
        quitbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                Head.frame.setVisible(true);
            }
        });


        //借阅书籍
        borrowbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String s = JOptionPane.showInputDialog("请输入需要借阅的书籍编号：");
//                Database.BorrowAdd(s,Head.UserName,time);
//                JOptionPane.showConfirmDialog(frame,"你去吗");
                String time = JOptionPane.showInputDialog("请输入借阅的天数:");
                boolean b = Database.BorrowAdd(s, Head.UserName, time);
                if (b) {
                    JOptionPane.showMessageDialog(panel, "借阅成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel, "借阅失败，图书编号错误", "警告", JOptionPane.WARNING_MESSAGE);

                }
            }
        });
        returnbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String s = JOptionPane.showInputDialog("请输入需要借阅的书籍编号：");
                boolean b = Database.DropBorrow(s);
                if (b) {
                    JOptionPane.showMessageDialog(panel, "还书成功", "通知", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel, "没有需要还书的书本", "通知", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}


