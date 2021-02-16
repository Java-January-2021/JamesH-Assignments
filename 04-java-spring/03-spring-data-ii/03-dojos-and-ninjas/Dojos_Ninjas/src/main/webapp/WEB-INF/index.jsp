<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>
	<h2>Welcome to the Dojo!</h2>
	<h3><a href="/dojo/new">Add New Dojo</a></h3>
	<h3><a href="/ninja/new">Add New Ninja</a></h3>
	<table>
		<thead>
			<tr>
				<th>Dojo List:</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ dojos }" var="dojo">
				<tr>
					<td><a href="/show/${ dojo.id }">${ dojo.name }</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>