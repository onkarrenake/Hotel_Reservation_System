<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Confirm</title>
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

body{
	position: absolute;
	width: auto;
	height: auto;
	background-image: url(https://s3-us-west-2.amazonaws.com/s.cdpn.io/142996/slider-2.jpg);
	background-size: cover;
}

.header{
	position: absolute;
	top: calc(50% - 35px);
	left: calc(50% - 255px);
	z-index: 2;
}

.header div{
	float: center;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span{
	color: #5379fa !important;
}
.navbar {
  overflow: hidden;
  background-color: #333;
  position: fixed;
  top: 0;
  width: 100%;
}

.navbar a {
  float: center;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background: #ddd;
  color: black;
}

.main {
  padding: 16px;
  margin-top: 30px;
  height: 1500px; /* Used in this example to enable scrolling */
}
</style>

</head>
<body>
<div class="navbar">
	<h2 style="color:white;" align = "center">Welcome To Hotel Room Reservation System </h2>
</div><br><br><br><br><br><br>
<h2 align = "center">Registration Confirm</h2>
<table align = "center">
<tr>
<td>Room Number</td><td>: ${rooms.roomNumber}</td>
</tr>
<tr>
<td>Room Type</td><td>: ${rooms.roomType }</td>
</tr>
<tr>
<td>Numbers Of Guests</td><td>: ${rooms.numbersOfGuests}</td>
</tr>
<tr>
<td>Check In Date</td><td>: ${rooms.checkInDate}</td>
</tr>
<tr>
<td>Check Out Date</td><td>: ${rooms.checkOutDate}</td>
</tr>
<tr>
<td>estimatedTime</td><td>: ${rooms.estimatedTime}</td>
</tr>
</table>

<form action = "confirmRoomBooking" method = "post" align = "center">
	<h2>Enter the Boking Details</h2>
	<table align = "center">
		<tr>
		<td>First Name</td><td>: <input type = "text" name = "userFirstName" value = "${rooms.firstName }" required></td>
		</tr>
		<tr>
		<td>Last Name</td><td>: <input type = "text" name = "userLastName" value = "${rooms.lastName }" required></td>
		</tr>
		<tr>
		<td>EmailID</td><td>: <input type = "text" name = "userEmail" value = "${rooms.email }" required></td>
		</tr>
		<tr>
		<td>Mobile NO.</td><td>: <input type = "text" name = "userMobileNumber" value = "${rooms.mobileNumber }" required></td>
		</tr>
	</table>
	<input type = "hidden" name = "roomId" value = "${rooms.id}">
	<input type = "hidden" name = "roomCheckedIn" value = "true">
	<h2>Enter the Card Details Dammy Payment</h2>
	<table align = "center">
		<tr>
		<td>Card Number</td><td>: <input type = "text" name = "cardNumber" required></td>
		</tr>
		<tr>
		<td>Card Holder</td><td>: <input type = "text" name = "cardHolderName" required></td>
		</tr>
		<tr>
		<td>Expiration Date</td><td>: <input type = "text" name = "expirationDate" required ></td>
		</tr>
		<tr>
		<td>CVV </td><td>: <input type = "text" name = "cvvCode" required ></td>
		</tr>
		<tr>
		<td><input type = "submit" value = "confirm to pay" required></td><td></td>
		</tr>
	</table>
</form>
</body>
</html>