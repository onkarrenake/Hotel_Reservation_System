<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To the Registration</title>
<style>
@import url(https://fonts.googleapis.com/css?family=Exo:100,200,400);
@import url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);

body{
	margin: 0;
	padding: 0;
	background: #fff;

	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image: url(https://s3-us-west-2.amazonaws.com/s.cdpn.io/142996/slider-2.jpg);
	background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header{
	position: absolute;
	top: calc(50% - 35px);
	left: calc(50% - 255px);
	z-index: 2;
}

.header div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span{
	color: #5379fa !important;
}

.login{
	position: absolute;
	top: calc(50% - 75px);
	left: calc(60% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=submit]{
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=submit]:hover{
	opacity: 0.8;
}

.login input[type=submit]:active{
	opacity: 0.6;
}

.login input[type=text]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=submit]:focus{
	outline: none;
}

::-webkit-input-placeholder{
   color: rgba(255,255,255,0.6);
}

::-moz-input-placeholder{
   color: rgba(255,255,255,0.6);
}
</style>

</head>
<body>
<!--  div class="navbar">
		<a href = "userRegistration"><i>User Register link</i></a>
	<a href = "userLogin"><i>User LogIn link</i></a>
	<a href = "AdminLogin"><i>Admin Login link</i></a>&nbsp;&nbsp;
	<h2 style="color:white;">Welcome To Hotel Room Reservation System </h2>
</div>
<br><br><br><br><h2 align = "center">Visitor Registration</h2><hr><br><br>
	<form action="userRegConfirmation" method = "post" align = "center">
		<table align = "center">
		<tr>
		<td>First Name : </td><td><input type = "text" name = "firstName" required></td>
		</tr>
		<tr>
		<td>Last Name : </td><td><input type = "text" name = "lastName" required></td>
		</tr>
		<tr>
		<td>Mobile Number : </td><td><input type = "text" name = "mobileNumber" required></td>
		</tr>
		<tr>
		<td>Email ID : </td><td><input type = "text" name = "email" required></td>
		</tr>
		<tr>
		<td>Password : </td><td><input type = "password" name = "password" required></td>
		</tr>
		<tr>
		<td><input type = "submit" value = "Submit"></td>
		</tr>
		<tr>
		<td><a href = "userLogin"><i>LogIn Here ?</i></a></td>
		</tr>
		</table>
	</form>
	-->
	
	 	<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>User<span>Registration</span></div>
		</div>
		<br>
		
		<div class="login">
		<form action="userRegConfirmation" method = "post">
				<input type="text" placeholder="First Name" name="firstName" required><br><br>
				<input type="text" placeholder="Last Name" name="lastName" required><br><br>
				<input type="text" placeholder="Mobile Number" name="mobileNumber" required><br><br>
				<input type="text" placeholder="Email Id" name="email"><br>
				<input type="password" placeholder="password" name="password" required><br>
				<input type="submit" value="Register">
		</form>
		</div>
</body>
</html>