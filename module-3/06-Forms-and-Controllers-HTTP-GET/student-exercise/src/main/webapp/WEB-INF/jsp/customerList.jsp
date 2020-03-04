<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<body>
<c:url value="/searchCustomers" var="formAction" />
<form method="GET" action="${formAction}">
		<div>	
			<label for="actorsName">:Name </label>
			<input type="text" id="searchedName" name="searchedName" />
			
		</div>
		
		<div>
		<label for="sort">Sort</label> 
			<br><select id="sort" name="sort">
			<option value="lastname">Last Name</option>
			<option value="email">Email</option>
			<option value="active">Active</option>

			</select>
			</div>
			<input type="submit" value="Submit" />
		

</form>



<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${customers}" var="customer">
<tr>
    <td> 
    ${customer.lastName} ${customer.email}
    </td>
</tr>
</c:forEach>
</table>

<%@include file="common/footer.jspf"%>