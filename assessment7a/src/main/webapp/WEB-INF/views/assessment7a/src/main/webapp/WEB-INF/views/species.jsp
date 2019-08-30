<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>Animal</h1>

<div>	
<h2>Animal Details</h2>
	<p>Name: ${animal.name} <p>
	<p>Diet: ${animal.diet}<p>	
	<p>Habitat: ${animal.habitat}<p>			
			
	<p>Extras:</p>
	<ul>
		<c:forEach items="${donut.extras}" var="i">
				<li><c:out value="${i}"/></li>
		</c:forEach>
	</ul>
</div>

</body>
</html>