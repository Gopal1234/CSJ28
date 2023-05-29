<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1><font color="blue">Welcome ${userKey}</font></h1>
<body>
<form action="/Csj28SpringBootDemo2/editMyFlight">
Enter Flight Number:<input type="text" name="t" value="${flight.flightNumber}"><br>
Enter Flight Source:<input type="text" name="t1" value="${flight.flightSource}"><br>
Enter Flight Destination:<input type="text" name="t2" value="${flight.flightDestination}"><br>
Enter Flight price:<input type="text" name="t3" value="${flight.price}"><br>
<input type="submit" value="update">
</form>
</body>
</html>