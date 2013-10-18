<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<title>single file upload</title>
	</head>

	<body>
		<s:fielderror></s:fielderror>
		<s:form action="fileUpload" method="post"
			enctype="multipart/form-data">
			<!-- form标签的属性enctype表示表单数据的编码方式，以"multipart/form-data"方式编码的表单会以二进制方式来处理表单数据，这种编码方式会把文件域指定文件的内容也封装到请求参数里 -->

			<s:file name="myFile" label="Image File" />
			<s:textfield name="caption" label="Caption"></s:textfield>
			<s:submit />
		</s:form>
		<br>
	</body>
</html>
