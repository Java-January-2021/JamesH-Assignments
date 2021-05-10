<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<link rel="stylesheet" href="css/soloStyle.css">
</head>
<body>
	<div class="wrapper">
		<div id="nav-bar">
			<ul>
	            <li><a href="/">Home</a></li>
	            <li><a href="/projects">Projects</a></li>
	            <li><a href="/getinvolved">Get Involved</a></li>
	    	</ul>
		</div>
		<h1 class="header">Admin Login</h1>
		<p><c:out value="${error}" /></p>
	    	<form class="form" method="post" action="/adminlogin">
		        <div class="form_input">
		            <label for="name">Name: </label>
		            <input type="text" id="name" name="name"/>
		        </div>
		        <div class="form_input">
		            <label for="password">Password</label>
		            <input type="password" id="password" name="password"/>
		        </div>
	        <input class="submit_btn" type="submit" value="Login"/>
	    </form>
	</div>
</body>
</html>