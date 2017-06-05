<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆页面</title>
</head>
<body> 
<form name="form1"  action="countServlet"  method="post">
	账号：<input type="text"  name="account" ><br>
	密码：<input type="password"  name="pwd" ><br>
	<input type="submit" name="submit" value="登陆">
</form>
</body>
</html>