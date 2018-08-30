<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../login.do" method="get">
<table align="center" border="0">

<tr><td>
useranme:</td><td><input type="text" name="uname" max="10">
</td></tr>
<tr><td>
password:</td><td><strong><input type="password" name="pwd" min="5" max="10"/></strong>
</td></tr>

</td><td><input type="submit" value="login"/>
</td></tr>
</body>
</html>