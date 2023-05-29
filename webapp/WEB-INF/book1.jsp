<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="blue">Hello ${userKey} !!!</font></h1>
<p><font color="tomato">Thanks for showing your interest to travel with </font><img alt="Indigo" src="/images/indigo-logo.png" height="70" width="70"></img><br>
<h5>your selected details are:</h5>
you are traveling from <font color="green"> <b> ${bookKey1.flightSource}</b> to<b> ${bookKey1.flightDestination}</b></font>
we will  charge flight fare<font color="red"> <b> ${bookKey1.price * 0.12} </b> with GST(0.12%)</font>
</p>
<a href="/book2">Continue Booking....</a>

</body>
</html>