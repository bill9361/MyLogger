<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Welcome
<br/>
姓名：${requestScope.name}
<br/>
年龄：${requestScope.age}
<br/>
姓名1：${requestScope.name}
<br/>
邮箱：${requestScope.email}
<br/>
邮箱1：${requestScope.email1}
<br/>
<br/>
<a href="testSessionAttribute.do">测试SessionAttribute</a>
</body>
</html>