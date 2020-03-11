<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
		<!-- public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> myString = new ArrayList<String>();
		for (Integer buzzer : integerArray) {
			
			
			if (buzzer % 5 == 0 && buzzer % 3 == 0)
				myString.add("FizzBuzz");
			else if (buzzer % 3 == 0)
				myString.add("Fizz");
			else if (buzzer % 5 ==0) {
				myString.add("Buzz");
			
			}else {
				myString.add(tar.toString());
			}
				
		}
		
		return myString;
	} -->
	<c:forEach var="name" begin="1" end="100">
	<c:choose>
		<c:when test="${name % 5 == 0 and name % 3 == 0}">
			<LI class=fizzbuzz> ${name}
		</c:when>
		<c:when test="${name % 3 == 0}">
			<LI class=fizz> ${name}
		</c:when>
		<c:when test="${name % 5 == 0}">
			<LI class=buzz> ${name} 
		</c:when>
		<c:otherwise>
			<LI>${name} 
		</c:otherwise>
		
	</c:choose>
	
	</c:forEach>
		</ul>
	</body>
</html>