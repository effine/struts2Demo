<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'test.jsp' starting page</title>
	</head>

	<body>
		<form action="test">
			<input type="text" name="user" size="50" />
			<br>
			<input type="file" name="image" size="50" />
			<br>
			<input type="submit" value="提交" name="submit" />
		</form>
	</body>
</html>
