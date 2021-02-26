<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Question</title>
</head>
<body>
	<h2>What is your Question?</h2>
	<form action="/question/create" method="POST">
	
		<label for="question">Question: </label>
		<input type="text" name="question"/>
		
		<label for="tags">Tags: </label>
		<input type="text" name="tags"/>
		
		<input type="submit" value="Submit"/>
		
	</form> 
	<a href="/">back to home screen</a>
</body>
</html>