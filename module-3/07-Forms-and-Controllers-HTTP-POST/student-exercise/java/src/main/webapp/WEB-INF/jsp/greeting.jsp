<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<h1>Book Review></h1>
		<img src="etc/forDummies.png" alt="Book Cover">
		
	</body>
	
	<p><h3><a
		href="createReview">New review</a></h3></p>

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
				<c:out value="${review.dateSubmittedFormated}" />
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
