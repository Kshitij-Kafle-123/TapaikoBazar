<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>


</head>
<body>
	

		<table class="table table-striped">
			<thead>
				<tr>
					<th>SN</th>
					<th>Product Name</th>
					
					<th>Price</th>
					<th>Category</th>
					
					
				
					<th>Action</th>

				</tr>
			</thead>
			<tbody>
			
					<tr>
						<td><c:out value="${count}" /></td>
						<td><c:out value="${product.productName}" /></td>
						
						<td><c:out value="${product.price}" /></td>
						<td><c:out value="${product.category }" /></td>
					
					
					
						<td>
						<a href="ProductController?actions=product_remove&id=${product.id}">Delete</a>
						
						</td>
					</tr>
				
			</tbody>
		</table>

	
	

</body>
<input type="submit" value="Checkout">
	<a href="home.jsp">Home</a>
	<a href="product.jsp">Continue</a>
</html> --%>