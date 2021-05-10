<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration</title>
<link rel="stylesheet" href="css/soloStyle.css">
</head>
<body>
	<div class="wrapper">
		<h2 class="header">Register Admin</h2>
		<form:form class="form" method="POST" action="/adminregister" modelAttribute="admin">
		
		<div class="form_input">
			<form:label path="name">Name: </form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</div>
	
		<div class="form_input">
			<form:label path="password">Password: </form:label>
			<form:errors path="password"/>
			<form:input path="password"/>
		</div>
		
		<div class="form_input">
			<form:label path="passwordConfirmation">Password Confirmation: </form:label>
			<form:errors path="passwordConfirmation"/>
			<form:input path="passwordConfirmation"/>
		</div>
		
		<input class="submit_btn" type="submit" value="Submit"/>
	</form:form>
	</div>
</body>
</html>