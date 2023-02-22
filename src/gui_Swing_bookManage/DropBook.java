package gui_Swing_bookManage;





        import gui_Swing_bookManage.mysql.Database;
        import gui_Swing_bookManage.object.Book;

        import javax.swing.*;
        import javax.xml.crypto.Data;
        import java.awt.*;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.util.List;

public class DropBook {

    private static JDesktopPane jDesktopPane3 = UpdatePasswd.jDesktopPane;//主页面  主面板
    private static JInternalFrame LibraryFrame = new JInternalFrame("图书修改", true, true, true, true);
    private static final int Size = 12;

    private static JPanel panel = new JPanel();
    private static Box box =  Box.createHorizontalBox();
    private static JLabel label = new JLabel("图书名称：");
    private static JTextField textField = new JTextField(12);
    private static JButton button = new JButton("删除");

    private static JLabel booklabel = new JLabel("书名");
    private static String[] name ={"图书序号","作者","书名","价格","出版社","出版时间","库存数量","分类"};
    private static JTable booktable = null;
    private static JScrollPane scrollPane = null;
    private static JPanel panel1 = new JPanel();

    public static void Wind() {
        LibraryFrame.setLayout(new BorderLayout());//设置子页面布局                  LibraryFrame弹出页面
        jDesktopPane3.add(LibraryFrame);//                                         jDesktopPane3中间面板
        Head.frame.add(jDesktopPane3, BorderLayout.CENTER);

        box.add(label);
        box.add(textField);
        box.add(button);
        panel.add(box);
        LibraryFrame.add(panel,BorderLayout.NORTH);

        List<Book> books = Database.SelectBook();
        Object[][] list = new Object[books.size()][8];
        for (int i=0;i<books.size();i++){
            Book book = books.get(i);
            list[i][0]=book.getId();
            list[i][1]=book.getAuthor();
            list[i][2]=book.getName();
            list[i][3]=book.getPages();
            list[i][4]=book.getPrice();
            list[i][5]=book.getTime();
            list[i][6]=book.getSize();
            list[i][7]=book.getType();
        }
        booktable = new JTable(list,name);
        scrollPane = new JScrollPane(booktable);
        panel1.add(scrollPane);
        LibraryFrame.add(panel1,BorderLayout.CENTER);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = textField.getText();
                Boolean b = Database.DropBook(text);
                panel1.remove(scrollPane);
                if (b){
                    JOptionPane.showMessageDialog(LibraryFrame, "恭喜你，图书删除成功", "通知", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(LibraryFrame, "抱歉，图书删除失败", "警告", JOptionPane.ERROR_MESSAGE);
                }
                List<Book> books = Database.SelectBook();
                Object[][] list = new Object[books.size()][8];
                for (int i=0;i<books.size();i++){
                    Book book = books.get(i);
                    list[i][0]=book.getId();
                    list[i][1]=book.getAuthor();
                    list[i][2]=book.getName();
                    list[i][3]=book.getPages();
                    list[i][4]=book.getPrice();
                    list[i][5]=book.getTime();
                    list[i][6]=book.getSize();
                    list[i][7]=book.getType();
                }
                booktable = new JTable(list,name);
                scrollPane = new JScrollPane(booktable);
                panel1.add(scrollPane);
                LibraryFrame.add(panel1,BorderLayout.CENTER);
                LibraryFrame.updateUI();
                SwingUtilities.updateComponentTreeUI(Head.frame);
            }
        });

        JOptionPane.showMessageDialog(LibraryFrame, "请输入需要删除的书本名称", "通知", JOptionPane.INFORMATION_MESSAGE);


        LibraryFrame.setSize(800, 500);//设置窗口大小
        LibraryFrame.setVisible(true);
        LibraryFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//关闭按钮
        LibraryFrame.updateUI();

        SwingUtilities.updateComponentTreeUI(Head.frame);
    }
}
