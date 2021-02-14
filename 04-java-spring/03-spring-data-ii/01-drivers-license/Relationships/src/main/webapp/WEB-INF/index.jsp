<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
</head>
<body>
	<h1>Welcome!</h1>
	<h2><a href="/person/new">Add New Person</a> | <a href="/license/new">Add New License</a></h2> 
	<table>
		<thead>
			<tr>
				<th>Persons Name</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${people}" var="peep">
			<tr>
				<td><a href="/person/${peep.id}">${peep.firstName} ${peep.lastName}</a></td>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>