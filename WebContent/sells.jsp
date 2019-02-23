<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sells Record</title>
<%@ include file="header4.jsp"%>

</head>
<body>
	
	<c:if test="${!empty product}">
		<table class="table table-striped">
			<thead>
				<tr>
					
					<th>Product Name</th>
					<th>Customer ID</th>
					<th>Product ID</th>
					

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product}" var="p" varStatus="d">
					<tr>
						
						<td><c:out value="${p.productName}" /></td>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${p.id}" /></td>
						
					
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>

</body>
</html>