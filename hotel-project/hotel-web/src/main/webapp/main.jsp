<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/common.js"></script>
<link rel="stylesheet" type="text/css"
	href="ext-theme-crisp/build/resources/ext-theme-crisp-all.css">
<!-- 引入Font Awesome的css文件 -->
<link type="text/css" rel="stylesheet"
	href="Font-Awesome-3.2.1/css/font-awesome.min.css">
<script type="text/javascript" src="js/ext-all.js"></script>
<script type="text/javascript"
	src="ext-theme-crisp/build/ext-theme-crisp.js"></script>
<script type="text/javascript"
	src="ext-locale/build/ext-locale-zh_CN.js"></script>

<script type="text/javascript" src="js/main.js"></script>


</head>

<body>
	<div id='searchArea' style="width:929px; margin:auto; "></div>
</body>
</html>