<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Hello Spring MVC</title>
</head>
<body>
	<h1>Book Page</h1>
	<img src="etc/forDummies.png" alt="Book Cover">


	<p><h3><a
		href="createReview">Write
		a new review</a></h3></p>

	<table class="table">
		<h1>Reviews</h1>
		<c:forEach items="${reviews}" var="review">
			<hr>
			<p>
				<b><c:out value="${review.title}" /></b> (
				<c:out value="${review.username}" />
				)
			</p>
			<p>
				<c:out value="${review.dateSubmitted}" />
			</p>
			<p>
				<c:out value="${review.text}" />
			</p>
			<c:choose>
				<c:when test="${review.rating == 1}">
					<img src="etc/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 2}">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 3}">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
				</c:when>
				<c:when test="${review.rating == 4}">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
				</c:when>
				<c:otherwise>
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
					<img src="etc/star.png" alt="Product Rating">
				</c:otherwise>
			</c:choose>

		</c:forEach>
	</table>


</body>
</html>





<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reviews</title>
 <c:url value="/css/squirrel.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
<body>
	
	<c:forEach var="review" items="${reviews}">
	
		<div> 
		<p>${review.title} (${review.username})</p>
		<p>%{review.dateSubmitted}</p>
		
		<c:forEach begin="1" end="${review.rating}" step="1">
				<img src="etc/star.png" />
		</c:forEach>
		<p>${review.rating}</p>
		<p>${review.text}</p>
		
		</div>
	</c:forEach>
	
</body>
</html> --%>