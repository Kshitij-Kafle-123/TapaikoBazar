<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Details</title>
<%@ include file="header4.jsp"%>

</head>
<body>

	<c:if test="${!empty customer}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Customer Name</th>
					<th>CID</th>
					<th>Address</th>
					<th>Email</th>
					<th>Phone</th>

					<!-- <th>Image_Url</th> -->




				</tr>
			</thead>
			<tbody>
				<c:forEach items="${customer}" var="p" varStatus="d">
					<tr>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${p.firstName}" /> <c:out
								value="${p.lastName}" /></td>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${p.address}" /></td>
						<td><c:out value="${p.email }" /></td>
						<td><c:out value="${p.phoneNo }" /></td>
						<%-- 	<td><c:out value="${p.imgUrl}" /></td> --%>



					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>

</body>
</html>