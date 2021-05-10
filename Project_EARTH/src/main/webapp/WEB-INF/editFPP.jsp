<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Post</title>
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
		<h1 class="header">Edit Post</h1>
		<p><c:out value="${error}" /></p>
		
		<form:form method="POST" action="/forest/${ post.id }/edit" modelAttribute="edit">
		
			<form:label path="text">Edit text here: </form:label>
			<form:errors path="text"/>
			<form:input value="${ post.text }" path="text"/>
			
			<input class="edit_btn" type="submit" value="Update"/>
		</form:form>
	</div>
</body>
</html>