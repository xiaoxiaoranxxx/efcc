import java.sql.*;

public class Xiu {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/xiaoxiaoran";
            String username = "root";
            String password = "root";

            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String user = "admin";
            String pwd = "admin";
            String sql = "select * from users where username='" + user + "' and  password='" + pwd + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            System.out.println(rs.next()); // true
            rs.close();

            user = "admi' or 1=1 -- +";
            pwd = "admin";
            sql = "select * from users where username='" + user + "' and  password='" + pwd + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            System.out.println(rs.next()); // true

            rs.close();
            System.out.println();
            
            // 预处理 防SQL注入
            sql = "select * from users where username=? and password=? ";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            user = "admi' or 1=1 -- +";
            pwd = "admin";
            ptmt.setString(1, user);
            ptmt.setString(2, pwd);
            rs = ptmt.executeQuery();
            System.out.println(rs.next()); // false

            user = "admin";
            pwd = "admin";
            ptmt.setString(1, user);
            ptmt.setString(2, pwd);
            rs = ptmt.executeQuery();
            System.out.println(rs.next()); // true

            rs.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null)
                rs.close();
            rs = null;

            stmt.close();
            stmt = null;

            conn.close();
            conn = null;
        }

    }
}
