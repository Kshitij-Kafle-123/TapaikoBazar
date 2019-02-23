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


</head>
<body>
	<div class="container jumbotron">
		<div class="row col-md-12">
			<div class="col-md-2"></div>
			<div class="col-md-8 jumbotron">
				<fieldset style="width: 500px">
					<legend>Customer Details</legend>
					<p>Enter your details</p>
					<!--  enctype="multipart/form-data"-->
					<form action="CustomerController" method="post" class="form-horizontal">
						<span> <input type="hidden" name="id" value=""
							class="form-control">
						</span>
						<div class="form-group">
							<label>First Name</label> <input type="text" name="fname"
								value="" class="form-control">
						</div>

						<div class="form-group">
							<label>Last Name</label> <input type="text" name="lname" value=""
								class="form-control">
						</div>





						<div class="form-group">
							<label>Address</label> <input type="text" name="address" value=""
								class="form-control">
						</div>



						<div class="form-group">
							<label>Email</label> <input type="email" name="email" value=""
								class="form-control">
						</div>
						<%-- <div class="form-group">
									<label>Image-Url</label> <input type="file" name="image"
										value="${product.imgUrl }" class="form-control">
								</div> --%>


						<div class="form-group">
							<label>Phone</label> <input type="text" name="phone" value=""
								class="form-control">


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

						<div class="form-group">
							<div class="row">
								<div class="col-sm-6 col-sm-offset-3">
									<button type="button" class="btn btn-primary"
								onclick="location.href='product.jsp'">Cancel</button>
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