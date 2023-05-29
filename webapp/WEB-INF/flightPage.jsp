<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="blue">Welcome ${userKey}</font></h1>
<form action="addFlight">
Enter Flight Number:<input type="text" name=
"flightNumber"><br>
Enter Flight Name:<input type="text" name="flightName"><br>
Enter Soure:<input type="text" name="flightSource"><br>
Enter Destination:<input type="text" name="flightDestination"><br>
Enter price:<input type="text" name="price"><br>
Enter Flight Date:<input type="date" name="flihgtDate"><br>
<!--Enter Flight layover points:<select name="layOvers" multiple>
<option value="KOLKATA">Kolkata</option>
<option value="DELHI">delhi</option>
<option value="PUNE">Pune</option>
<option value="Bangalore">Bangalore</option>-->
Enter Flight layovers:<input type="text" name="layOvers"><br>
<input type="submit" value="AddFlight">



</form>
<a href="/viewFlightInTable">View All Flights</a>
</body>
</html>