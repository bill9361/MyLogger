<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My test index title</title>
</head>
<body>

<a href="login/welcome1.html">welcome</a>

<br/>
<br/>

<a href="login/testPathVar/12.do">testPathVar</a>

<br/>
<br/>
删除ID为1234的数据：
<form action="login/testMethodDelete/1234.do" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
	<input type="submit" value="DELETE"/>
</form>

<br/>
<br/>
获取请求参数的数据：
<form action="login/testRequestParam.do" method="post">
	ID:
	<input type="text" name="id"/>
	Name:
	<input type="text" name="name">
	<input type="submit" value="Submit"/>
</form>

<br/>
<br/>
使用POJO对象绑定请求参数的值：
<form action="login/testPojo.do" method="post">
	ID:
	<br/>
	<input type="text" name="id"/>
	<br/>
	姓名:
	<br/>
	<input type="text" name="name"/>
	<br/>
	城市:
	<br/>
	<input type="text" name="address.city"/>
	<br/>
	街道:
	<br/>
	<input type="text" name="address.street"/>
	<br/>
	<input type="submit" value="Submit"/>
</form>

<br/>
<br/>

获取请求报头信息：
<a href="login/testRequestHeader.do">测试RequestHeader</a>


<br/>
<br/>
测试CookieValue：
<a href="login/testCookieValue.do">测试CookieValue</a>
<br/>
<br/>
测试ServletAPI：
<a href="login/testServletAPI.do">测试ServletAPI</a>


<br/>
<br/>
测试ModelAndView：
<a href="login/testModelAndView.do">测试ModelAndView</a>
<br/>
<br/>
测试Map：
<a href="login/testMap.do">测试Map</a>
<br/>
<br/>
测试Model：
<a href="login/testModel.do">测试Model</a>
<br/>
<br/>
测试ModelMap：
<a href="login/testModelMap.do">测试ModelMap</a>

</body>
</html>