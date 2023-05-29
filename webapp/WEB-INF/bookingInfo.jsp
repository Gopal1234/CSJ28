<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Congratulation!!! ${bookInfo.userName}</h1><br>
<h2>your booking id is ${bookInfo.bookingId}</h2><br>
<h3>From :${bookInfo.flight.getFlightSource()}</h3>&nbsp&nbsp&nbsp
<h3>To :${bookInfo.flight.getFlightDestination()}</h3>
<h4>Flight Number:${bookInfo.flight.getFlightNumber()}</h4>
<h5>Total Amount:${bookInfo.getTotalPrice()}</h5>
<h5></h5>









</body>
</html>