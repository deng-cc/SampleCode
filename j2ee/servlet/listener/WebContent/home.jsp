<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>这是通过Servlet控制跳转过来的</title>
</head>
<body>
欢迎您，<%=request.getParameter("account") %><br>
您的密码是：<%=request.getParameter("pwd") %><br>
您是本站的第<%=application.getAttribute("count") %>位访问者
</body>
</html>