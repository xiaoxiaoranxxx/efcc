<%--
  Created by IntelliJ IDEA.
  User: xiao'xiao'ran
  Date: 2023/1/9
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <h1><%= new java.util.Date() %></h1>
  <hr>
</head>
<body>
xiaoxiaoranffccc444777

<% for (int i=0;i<5;i++) { %>
<h2>hello ${i} </h2>
<% } %>

<form action="${pageContext.request.contextPath}/login" method="get">
  <input type="text" name="u" />
  <input type="password" name="r" />
  <button type="submit">提交</button>

</form>

</body>
</html>