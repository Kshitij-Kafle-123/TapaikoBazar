<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
<%@ include file="header4.jsp"%>

</head>
<body>
	<a href="ProductController?actions=add">New Product</a>
	<c:if test="${!empty product}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Product Name</th>
					<th>ID</th>
					<th>Price</th>
					<th>Category</th>
					<!-- <th>Image_Url</th> -->
					
				
					<th>Actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${product}" var="p" varStatus="d">
					<tr>
						<td><c:out value="${d.count}" /></td>
						<td><c:out value="${p.productName}" /></td>
						<td><c:out value="${p.id}" /></td>
						<td><c:out value="${p.price}" /></td>
						<td><c:out value="${p.category }" /></td>
					<%-- 	<td><c:out value="${p.imgUrl}" /></td> --%>
					
					
						<td>
						<a href="ProductController?actions=product_delete&id=${p.id}">Delete</a>
						|<a href="ProductController?actions=product_edit&id=${p.id}">Edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>

</body>
</html>