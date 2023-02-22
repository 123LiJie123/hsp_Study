package gui_Swing_bookManage.mysql;


        import gui_Swing_bookManage.object.Book;
        import gui_Swing_bookManage.object.User;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class Database {

    private static final String user = "root";
    private static final String passwd = "";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/library1?useUnicode=true&characterEncoding=utf8&useSSL=true";

    //数据库的创建账户
    public static void CreateAccount() {
        Connection conn = null;
        Statement state = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            state = conn.createStatement();
            String sql = "create table if not exists user(username char(11) unique,passwd char(20),judge int)";
            int i = state.executeUpdate(sql);
            String sql2 = "insert into user value('root','123456',1)";
            state.executeUpdate(sql2);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库创建失败...");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                state.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据库创建成功");
    }

    //添加用户
    public static Boolean AddUser(String text, String password, int judge) {
        Connection conn = null;
        PreparedStatement pared = null;
        int i = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "insert into user value(?,?,?)";
            pared = conn.prepareStatement(sql);
            pared.setString(1, text);
            pared.setString(2, password);
            pared.setInt(3, judge);
            i = pared.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pared.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    //查询账号密码
    public static int QueryUser(String name, String password) {
        Connection conn = null;
        PreparedStatement pst = null;
        int i = -1;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "select * from user where username=? and passwd=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            ResultSet resultSet = pst.executeQuery();
            boolean next = resultSet.next();
            i = resultSet.getInt(3);//返回第三个值，判断用户权限
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("密码输入错误");
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static List<User> SelectUser(String text) {
        Connection conn = null;
        PreparedStatement pst = null;
        List<User> Users = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "select * from user";
            String sql1 = "select * from user where username = ?";
            pst = conn.prepareStatement(sql);
            if (text != null && !text.equals("")) {
                pst = conn.prepareStatement(sql1);
                pst.setString(1, text);
            }
            ResultSet resultSet = pst.executeQuery();
            Users = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User();
                user.setUser(resultSet.getString(1));
                user.setPasswd(resultSet.getString(2));
                user.setJudge(resultSet.getInt(3));
                Users.add(user);
            }
        } catch (Exception e) {
            System.out.println("数据查询错误");
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return Users;
    }

    public static List<User> SelectUser() {
        Connection conn = null;
        PreparedStatement pst = null;
        List<User> Users = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "select * from user";
            pst = conn.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            Users = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User();
                user.setUser(resultSet.getString(1));
                user.setPasswd(resultSet.getString(2));
                user.setJudge(resultSet.getInt(3));
                Users.add(user);
            }
        } catch (Exception e) {
            System.out.println("数据查询错误");
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return Users;
    }

    //删除数据
    public static Boolean RemoveUser(String text, String password, int index) {
        Connection conn = null;
        Statement statement = null;
        int i = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "delete from user where username='" + text + "' and passwd='" + password + "' and judge='" + index + "'";
            statement = conn.createStatement();
            i = statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Book> SelectBook(String bookName, String text, String item) {
        Connection conn = null;
        Statement statement = null;
        String sql = "select * from book where type= '" + item + "'";
        String sql2 = "select * from book where author='" + text + "' and type='" + item + "'";
        String sql3 = "select * from book where name='" + bookName + "' and type='" + item + "'";
        String sql1 = "select * from book where name='" + bookName + "' and author='" + text + "' and type='" + item + "'";
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            statement = conn.createStatement();
            ResultSet resultSet = null;
            if (bookName.equals("") && text.equals("")) {
                resultSet = statement.executeQuery(sql);
            } else if (bookName.equals("")) {
                resultSet = statement.executeQuery(sql2);
            } else if (text.equals("")) {
                resultSet = statement.executeQuery(sql3);
            } else {
                resultSet = statement.executeQuery(sql1);
            }

            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt(1));
                book.setAuthor(resultSet.getString(2));
                book.setName(resultSet.getString(3));
                book.setPages(resultSet.getInt(4));
                book.setPrice(resultSet.getString(5));
                book.setTime(resultSet.getDate(6));
                book.setSize(resultSet.getDouble(7));
                book.setType(resultSet.getString(8));
                books.add(book);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return books;
    }

    public static List<Book> SelectBook() {
        Connection conn = null;
        Statement statement = null;
        String sql = "select * from book ";
        List<Book> books = new ArrayList<>();
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getInt(1));
                book.setAuthor(resultSet.getString(2));
                book.setName(resultSet.getString(3));
                book.setPages(resultSet.getInt(4));
                book.setPrice(resultSet.getString(5));
                book.setTime(resultSet.getDate(6));
                book.setSize(resultSet.getDouble(7));
                book.setType(resultSet.getString(8));
                books.add(book);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return books;
    }


    //借阅数据
    public static boolean BorrowAdd(String s, String UserName, String time) {
        Connection conn = null;
        Statement sta = null;
        int i = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            sta = conn.createStatement();
            String sql = "insert into borrow(id,create_time,update_time,username) values(" + s + ",now()," + time + "," + UserName + ")";
            i = sta.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                sta.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean AddBook(String texts, String texts1, String texts2, String texts3, String texts4, String texts5, String texts6, String texts7) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int i = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "insert into book value(?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, texts);
            stmt.setString(2, texts1);
            stmt.setString(3, texts2);
            stmt.setString(4, texts3);
            stmt.setString(5, texts4);
            stmt.setString(6, texts5);
            stmt.setString(7, texts6);
            stmt.setString(8, texts7);
            i = stmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static Boolean DropBook(String text) {
        Connection conn = null;
        PreparedStatement pstat = null;
        int i = 0;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "delete from book where name=?";
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, text);
            i = pstat.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstat.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean DropBorrow(String s) {
        int i = 0;
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            String sql = "delete  from borrow where id=?";
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, s);
            i = pstat.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

}