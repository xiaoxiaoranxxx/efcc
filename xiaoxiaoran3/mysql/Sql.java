import java.sql.*;

public class Sql {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/xiaoxiaoran";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "select * from books";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "-->价格$" + rs.getString("author"));
            }

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
