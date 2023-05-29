<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addUser" method="post">
Enter user name:<input type="text" name="userName"><br>

Enter user password:<input type="password" name="userPassword"><br>
Enter user type:<select name="userType">
<option value="admin">Amdin</option>
<option value="customer">Customer</option>

</select> <br>
<input type="submit" value="submit">




</form>
</body>
</html>