<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>表单</title>
</head>
<body>

<form action="2.jsp" method="post">


  <p>学号<input type="text" name="id"></p>
  <p>姓名<input type="text" name="name"></p>

  <input type="submit" value="提交">

  <%

  Object msg=request.getAttribute("msg");
  if(msg!=null){
    out.print(msg.toString());
  }

  %>

</form>

</body>
</html>

