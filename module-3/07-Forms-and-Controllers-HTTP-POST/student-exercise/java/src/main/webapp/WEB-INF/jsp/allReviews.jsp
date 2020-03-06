<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
</html>