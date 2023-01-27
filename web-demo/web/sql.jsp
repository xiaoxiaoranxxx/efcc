<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    //	1、加载驱动类
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/xiaoxiaoran";
    Connection connection = DriverManager.getConnection(url, "root", "root");
    Statement statement = connection.createStatement();
    String sql = "select * from books";								//	查
    //5、执行查询
    ResultSet res = statement.executeQuery(sql);	//	返回查询结果集
    while(res.next()){
%>
<table>
    <tr>
        <td><%=res.getInt(1) %></td>
        <td><%=res.getString(2)%></td>
    </tr>
</table>
<%
    }
//	6、关流
    res.close();
    statement.close();
    connection.close();
%>

</body>
</html>

