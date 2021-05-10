<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Involved</title>
<link rel="stylesheet" href="css/soloStyle.css">
</head>
<body>
	<div class="wrapper">
		<div id="nav-bar">
			<ul>
	            <li><a href="/">Home</a></li>
	            <li><a href="/projects">Projects</a></li>
	            <li><a href="/getinvolved">Get Involved</a></li>
	            <c:if test="${ admin.id != null }"><li><a href="/adminhome">Admin Home</a></li></c:if> 
	            <c:if test="${ admin.id != null }"><li><a href="/logout">Log Out</a></li></c:if>
	    	</ul>
		</div>
		<h1 class="header">Get Involved</h1>
		<h3 class="header_text">Register to receive email's about upcoming events, progress reports, and more. Leave us a message if you want to get more involved. One way to get more involved is to become a volunteer!</h3>
		
		<form:form class="form" method="POST" action="/userregister" modelAttribute="register">
		
		<div class="form_input">
			<form:label path="name">Name: </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</div>
		
		<div class="form_input">
			<form:label path="email">Email: </form:label>
			<form:errors path="email"/>
			<form:input path="email"/>
		</div>
		
		<div class="form_input">
			<form:label path="phoneNumber">Phone Number: </form:label>
			<form:errors path="phoneNumber"/>
			<form:input path="phoneNumber"/>
		</div>
		
		<div class="form_input">
			<form:label path="message">Message: </form:label>
			<form:errors path="message"/>
			<form:input path="message"/>
		</div>
		
		<input class="submit_btn" type="submit" value="Submit"/>
	</form:form>
	</div>
</body>
</html>