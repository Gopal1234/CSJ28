<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Flight List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Flight Number</th><th>Flight Type</th><th>Source</th><th>Destination</th>
<th>Flight Date</th>
<th>LayOver Points</th>

<th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="flight" items="${ 
flights}">   
   <tr>  
   <td>${flight.flightNumber}</td>  
   <td>${flight.flightName}</td>  
   <td>${flight.flightSource}</td>  
   <td>${flight.flightDestination}</td>
   <td>${flight.flihgtDate}</td> 
    <td>${flight.layOvers}</td> 
    <td><a href="editFlight/${flight.flightNumber}">Edit</a></td>  
   <td><a href="deleteFlight/${flight.flightNumber}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>