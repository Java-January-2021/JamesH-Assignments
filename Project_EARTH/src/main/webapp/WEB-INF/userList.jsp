<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
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
	    	</ul>
		</div>
		<h2 class="header"> Welcome, <c:out value="${admin.name}"/></h2>
		<h3>Registered Users</h3>
		<table>
			<thead>
				<tr class="top_row">
					<th>Name</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Message</th>
					<th>Register Date</th>
				</tr> 
			</thead> 
			<tbody>
				<c:forEach items="${ users }" var="user">
					<tr>
						<td>${ user.name }</td> 
						<td>${ user.email }</td>
						<td>${ user.phoneNumber }</td> 
						<td>${ user.message }</td> 
						<td>${ user.createdAt }</td> 
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>