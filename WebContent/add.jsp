<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">

<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Product</title>
<div>
	<%@ include file="header4.jsp"%>

</div>

</head>
<body>
	<div class="container jumbotron">
		<div class="row col-md-12">
			<div class="col-md-2"></div>
			<div class="col-md-8 jumbotron">
				<fieldset style="width: 500px">
					<legend>Product Entry</legend>
					<!--  enctype="multipart/form-data"-->
					<form action="ProductController" method="post" class="form-horizontal" >
						<span> <input type="hidden" name="id" value=""
							class="form-control">
						</span>
						 <div class="form-group">
							<input type="hidden" name="pid"
								value="${product.id }" class="form-control">
						</div> 

						<div class="form-group">
							<label>Product Name</label> <input type="text" name="pname"
								value="${product.productName }" class="form-control">
						</div>





						<div class="form-group">
							<label>Price</label> <input type="number" name="price" value="${product.price }"
								class="form-control">
						</div>



						<div class="form-group">
							<label>Category</label> <select name="category"
								class="form-control">
								<option value="food" ${product.category=='food'?'selected':''}>Food</option>
								<option value="cloth" ${product.category=='cloth'?'selected':''}>Cloth</option>
								<option value="electronic"
									${product.category=='electronic'?'selected':''}>Electronic</option>
								<option value="book" ${product.category=='book'?'selected':''}>Book</option>
								
								
								

							</select>


						</div>
						<%-- <div class="form-group">
									<label>Image-Url</label> <input type="file" name="image"
										value="${product.imgUrl }" class="form-control">
								</div> --%>
						

						<div class="form-group">
							<label>Description</label><br>
							<textarea rows="4" cols="50" value="${product.description }" name="description">
                             
                           </textarea>
						</div>



						<div class="form-group">
							<div class="row">
								<div class="col-sm-6 col-sm-offset-3">
									<input type="submit" name="product-submit" id="product-submit"
										tabindex="2" class="form-control btn btn-submit"
										value="Submit">
								</div>
							</div>
						</div>



					</form>
				</fieldset>
			</div>

			<div class="col-md-2"></div>
		</div>
	</div>


</body>
</html>