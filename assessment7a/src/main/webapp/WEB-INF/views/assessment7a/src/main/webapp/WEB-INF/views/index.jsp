<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<div>
		<h1>Animal Selection</h1>
		<c:forEach items="${animals}" var="i">
			<tb>
				<tr><a href="/species?name=${i.name}">${i.species}${weight}</a></tr>
			</tb>		
		</c:forEach>
	</div>


</body>
</html>