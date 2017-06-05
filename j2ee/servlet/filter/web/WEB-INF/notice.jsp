<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Simple jsp page</title></head>
<body>
未到开放时间，该页面无法访问！<br>
开放时间为<%=request.getAttribute("start")%>点到<%=request.getAttribute("end")%>点!
</body>
</html>