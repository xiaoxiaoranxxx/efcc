<%@ page import="pojo.Users" %>
<%@ page import="dao.Userdao" %>
<%@ page import="daolmpl.UserDaolmpl" %><%--
  Created by IntelliJ IDEA.
  User: xiao'xiao'ran
  Date: 2022/5/24
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String id= request.getParameter("id");
    String name= request.getParameter("name");

    Users users =new Users();
    users.setTypeid(Integer.valueOf(id));
    users.setTypename(name);

    Userdao  userdao=new UserDaolmpl();
    boolean result= userdao.addUsers(users);
    if(result==true){
        request.setAttribute("msg","okok");
    }else {
        request.setAttribute("msg", "nono");
    }

    request.getRequestDispatcher("index.jsp").forward(request,response);
%>
</body>
</html>
