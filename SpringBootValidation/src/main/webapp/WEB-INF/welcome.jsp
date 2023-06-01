<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html> 
<html> 
<body> 
<p>Your Registration is confirmed successfully. Please, re-check the details.</p> 
 Name : ${registration.name} <br> 
Roll : ${registration.rollno} <br> 
Email: ${registration.email}<br> 
Courses:  
<ul> 
<c:forEach var="cs" items="${registration.courses}"> 
<li>${cs}</li> 
</c:forEach> 
</ul> 
 DOB :${registration.dob}
</body> 
</html> 
