<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

		<title>使用Struts2标签</title>

	</head>

	<body>
		<s:form action="LoginAction" method="post" namespace="/test">
			<s:textfield name="username" label="用户名："></s:textfield>
			<s:password name="password" label="密 码："></s:password>
			<s:submit value="Login"></s:submit>
		</s:form>
		<br>
	</body>
</html>
