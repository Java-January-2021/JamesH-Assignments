<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forest Project</title>
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
		<h1 class="header">Forest Project</h1>
		<embed src="/videos/mockingbird_copy.mp4" width="400" height="300">
		<p class="project_text">Welcome to the Forest Project. Our goal is to restore damaged forests ecosystems, and start new ones from scratch. One way we will do this is by planting trees, lots and lots of trees. One thing all forests have in common is huge expanses of thousands of trees. The theory is, if we can replicate a forest environment by planting thousands of trees, than we can start a brand new forest ecosystem. Why would we want to do this? Well, there are a few good reasons. One, is that forest land is shrinking around the world over time. Forests are a very important home for many plants and animals. It also acts as a renewable resource of building materials for the future. Our theory is that forests also build good fertile soil for growing food. Also, we suspect that forests prevent desertification, which would mean complete loss of livable space in a given location. In fact, one goal of this project is to reverse the growing desert landscapes, and turn them into forest land. The idea is that a good forest protects the soil from harsh solar radiation, and also holds soil in place during strong winds. Therefore we think that forests are the best and most stable environment on earth. Now lets go plant some trees! We welcome volunteers, if you want to help!</p>
		<h1 class="header">Project Blog</h1>
		<c:if test="${ admin.id != null }"> 
			<div class="blog_div">
			<div class="blog_label">New Post</div>
			<form class="blog_post" method="post" action="/forest">
				<div class="blog_input">
					<textarea cols="20" id="text" name="text"></textarea>
				</div>
			<input class="blog_btn" type="submit" value="Post"/>
			</form>
			</div>
		</c:if>
		<div>
			<table class="blog">
			<tbody>
				<c:forEach items="${ forestPP }" var="fpp">
					<tr>
						<td>${ fpp.createdAt }</td> 
						<td>${ fpp.text }</td> 
						<c:if test="${ admin.id != null }"> 
							<td><a class="edit_btn" href="/forest/${ fpp.id }/edit">Edit</a></td>
							<td><a class="edit_btn" href="/forest/${ fpp.id }/delete">Delete</a></td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>