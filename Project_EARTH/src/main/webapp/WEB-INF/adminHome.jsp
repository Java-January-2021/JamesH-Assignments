<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home</title>
<link rel="stylesheet" href="css/soloStyle.css">
</head>
<body>
	<div class="wrapper">
		<div id="nav-bar">
			<ul>
	            <li><a href="/adminhome">Admin Home</a></li>
	            <li><a href="/userlist">User List</a></li>
	            <li><a href="/forest">Forest Project</a></li>
	            <li><a href="/water">Water Project</a></li>
	            <li><a href="/animals">Animals Project</a></li>
	            <li><a href="/soil">Soil Project</a></li>
	            <li><a href="/logout">Log Out</a></li>
	    	</ul>
		</div>
		<h2 class="header"> Welcome, <c:out value="${admin.name}" /></h2>
		<h3>Here you can view a list of registered users, and post progress reports on project pages.</h3>
	</div>
</body>
</html>