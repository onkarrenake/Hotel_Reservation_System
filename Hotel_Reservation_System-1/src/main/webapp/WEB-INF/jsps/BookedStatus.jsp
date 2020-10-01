<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
<title>AdminPanel</title>
<style>
body {margin:0;}
h1{
  font-size: 30px;
  color: #fff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(255,255,255,0.3);
 }
.tbl-content{
  height:300px;
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(255,255,255,0.3);
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
}
td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}


/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #25c481, #25b7c4);
  background: linear-gradient(to right, #25c481, #25b7c4);
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 50px;
}


/* follow me template */
.made-with-love {
  margin-top: 40px;
  padding: 10px;
  clear: left;
  text-align: center;
  font-size: 10px;
  font-family: arial;
  color: #fff;
}
.made-with-love i {
  font-style: normal;
  color: #F50057;
  font-size: 14px;
  position: relative;
  top: 2px;
}
.made-with-love a {
  color: #fff;
  text-decoration: none;
}
.made-with-love a:hover {
  text-decoration: underline;
}


/* for custom scrollbar for webkit browser*/

::-webkit-scrollbar {
    width: 6px;
} 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
} 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
}
.navbar {
  overflow: hidden;
  background-color: #333;
  position: fixed;
  top: 0;
  width: 100%;
}

.navbar a {
  float: left;
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
 <a href="index.html">Home</a>
	<h2 style="color:white;" align = "center">Welcome To Hotel Room Reservation System </h2>
</div>

<div  class="tbl-header">
	  <table cellpadding="0" cellspacing="0" border="0">
	  <tr>
	  <th>ID </th>
	  <th>FIRST_NAME </th>
	  <th>LAST_NAME  </th>
	  <th>MOBILE_NUMBER </th>
	  <th>EMAIL </th>
	  <th>ROOM_NUMBER</th> 
	  <th>ROOM_TYPE</th>
	  <th>NUMBERS_OF_GUESTS</th>
	  <th>CHECK_IN_DATE</th>
	  <th>CHECK_OUT_DATE</th>
	  <th>ESTIMATED_TIME</th>
	  <th>ROOM_CHECKED_IN</th>
	  </tr>
	  <c:forEach items="${bookedStatus}" var = "rooms">
			<tr>
				<td>${rooms.id }</td>
				<td>${rooms.firstName }</td>
				<td>${rooms.lastName }</td>
				<td>${rooms.mobileNumber }</td>
				<td>${rooms.email }</td>
				<td>${rooms.roomNumber }</td>
				<td>${rooms.roomType}</td>
				<td>${rooms.numbersOfGuests}</td>
				<td>${rooms.checkInDate}</td>
				<td>${rooms.checkOutDate}</td>
				<td>${rooms.estimatedTime}</td>
				<td>${rooms.roomCheckedIn}</td>
			</tr>	
	  </c:forEach>		
	  </table>
</div>
</body>
</html>