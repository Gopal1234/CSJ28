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
<form action="checkFlights">
Enter Source:<input type="text" name="t1">&nbsp &nbsp &nbsp &nbsp
Enter Destination:<input type="text" name="t2">&nbsp &nbsp &nbsp &nbsp 
<br>
Enter Date of Jounery:<input type="date" name="t3">
<input type="submit" value="check">




</form>
</body>
</html>