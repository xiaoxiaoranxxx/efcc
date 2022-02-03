import java.sql.*;

public class Sql {
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

            String sql = "select * from books where bId>40 ";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "-此书作者-->" + rs.getString("author"));
            }
            rs.close();

            sql = "select * from books where bId>? ";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            ptmt.setInt(1, 40);
            rs = ptmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "-此书作者-->" + rs.getString("author"));
            }
            rs.close();
         

            sql = "UPDATE books SET bName=? WHERE bid =? ";
            PreparedStatement ptmt2 = conn.prepareStatement(sql);
            ptmt2.setString(1, "xiaoxiaoran");
            ptmt2.setInt(2, 45);
            ptmt2.execute();




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
