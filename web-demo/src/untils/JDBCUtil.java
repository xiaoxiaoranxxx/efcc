package untils;

import java.sql.*;

public class JDBCUtil {

    public Connection getConnection() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/xiaoxiaoran";
            String username = "root";
            String password = "root";

            try {
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("数据库连接成功");
                return  conn;
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public int execute(String sql,Object... objects){
        Connection connection=this.getConnection();
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            System.out.println("sql---->ok");
            for (int i=0;i<objects.length;i++){
                statement.setObject(i+1,objects[i]);
            }
            int line=statement.executeUpdate();
            statement.close();
            connection.close();
            return line;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  0;
    }



}

