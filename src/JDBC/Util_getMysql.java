package JDBC;

import java.sql.*;


public class Util_getMysql {
    static String url = "jdbc:mysql://localhost:3306/" + "db_homework02";
    static String user = "root";
    static String pwd = "";

    static Connection connection;
    static Statement statement = null;

    public static void main(String[] args) throws SQLException {


        String sql = "SELECT * FROM kc";

        //执行sql的对象 statement 执行sql的对象
        statement = getstatement();


        ResultSet resultSet = statement.executeQuery(sql);


        int row = resultSet.getRow();
        System.out.println(row);
        while (resultSet.next()) {
            System.out.println("kch：" + resultSet.getObject("kch"));
            System.out.println("kcmc：" + resultSet.getObject("kcmc"));
            System.out.println("");

            //   resultSet.getObject()   //在不知道列类型的时候用
            //  resultSet.getString    //指定的数据类型
        }

    }


    //获得连接
    public static Statement getstatement() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pwd);
            statement = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return statement;
    }


    //执行连接后的操作
    //查询表1

}
