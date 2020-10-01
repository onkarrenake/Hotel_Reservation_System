<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Rooms</title>
</head>
<body>
<h1>Search Rooms</h1><hr>
	<form action="AvailableRooms" method = "post">
	<pre>
		<!--  Location : <input type = "text" name = "location">-->
		Check-in date : <input type = "text" name = "checkInDate">
		Check-in date : <input type = "text" name = "checkOutDate">
		<!--  Numbers of guest : <input type = "text" name = "numbersOfGuest">-->
		<input type = "submit" name = "Search">	
	</pre>
	</form>
</body>
</html>