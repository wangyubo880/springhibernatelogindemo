<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>用户ID</th>
<th>用户名</th>
<th>用户密码</th>
<th>用户地址</th>
<th>用户email</th>
<th>操作</th></tr>
<c:forEach items="${userlist}" var="user">
<tr>
	<td>${user.id}</td>
	<td>${user.username}</td>
	<td>${user.password}</td>
	<td>${user.address}</td>
	<td>${user.email}</td>
	<td><a href="update.do?id=${user.id}">修改</a>||
	<a href="delete.do?id=${user.id}">删除</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>