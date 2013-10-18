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
		<title>more file upload</title>
	</head>

	<body>
		<s:fielderror></s:fielderror>
		<s:form action="multipleUpload" method="post"
			enctype="multipart/form-data">
			<s:file name="upload" label="file1" />
			<s:file name="upload" label="file2" />
			<s:file name="upload" label="file3" />
			<s:submit />
		</s:form>
		<br>
	</body>
</html>
