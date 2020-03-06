<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name= "pageTitle" value= "favorite things"/>
</c:import>
<section>
	<h2 id ="result">All your favorites.</h2>
	
	<table id= "table">
	<tr>
		<th>Favorite color ==></th>
		<td><c:out value="${theFavorite.favoriteColor}" /></td>
	</tr>
	<tr>
		<th>Favorite food ==></th>
		<td><c:out value="${theFavorite.favoriteFood}" /></td>
	</tr>
	<tr>
		<th>Favorite season ==></th>
		<td><c:out value="${theFavorite.favoriteSeason}" /></td>
	</tr>
	
</table>

 <h1 id= "result">Please Click <a href= page1>Here </a>to Start Over</h1></h1>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>