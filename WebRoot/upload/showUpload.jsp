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

		<title>show upload</title>

	</head>

	<body>
		<div
			style="padding: 3px; border: solid 1px #cccccc; text-align: center">
			<img
				src='UploadImages/
			<s:property value="serverFileName"/>
			' />
			<br />
			<s:property value="caption" />
			<br />
		</div>
	</body>
</html>
