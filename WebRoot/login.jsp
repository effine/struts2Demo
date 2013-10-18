<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<title>Login Pages</title>
	</head>

	<body>
		<form action="test/LoginAction" method="post">
			<input type="text" name="username" />
			<br />
			<input type="password" name="password" />
			<br />
			<input type="submit" value="Login" />
		</form>
		<br>
	</body>
</html>
