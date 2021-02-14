<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">


</head>
<body>
<div class="col-md-6 offset-md-3">
<form  action="loginprocess" method="post">

<div class="card-header bg-dark text-white">
<h3>Registration form </h3>
</div>

<div class="card-body bg-secondary">
<div class="form-group">
<input name = "customerId" type="name" class="form-control" placeholder="Enter customerId">
</div>
<div class="form-group">
<input name="password" type="password" class="form-control" placeholder="Enter password">
</div>


</div>
<div class="card-footer text-center bg-dark text-white">
<button type="submit" class="btn btn-outline-light">Register</button>
</div>

</form>
</div>
</body>
</html>