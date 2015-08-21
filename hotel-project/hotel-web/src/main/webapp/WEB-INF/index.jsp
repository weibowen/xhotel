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
<title>管理系统</title>

<link rel="stylesheet" type="text/css"
	href="ext-theme-crisp/build/resources/ext-theme-crisp-all.css">
<script type="text/javascript" src="js/ext-all.js"></script>
<script type="text/javascript"
	src="js/Ext.ux.window.Notification-2.1.3/Notification.js"></script>
<script type="text/javascript"
	src="ext-theme-crisp/build/ext-theme-crisp.js"></script>
<script type="text/javascript"
	src="ext-locale/build/ext-locale-zh_CN.js"></script>
<script type="text/javascript" src="js/index.js"></script>


</head>

<body>
	<div id="personInfoListPanel"></div>
</body>
</html>