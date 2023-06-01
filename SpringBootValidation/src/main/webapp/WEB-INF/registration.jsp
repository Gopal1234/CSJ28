<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html> 
<html> 
 
 
 
<style>
.c1{
color:red;
}
</style>
 
<head> 
    <title>Registration  Form</title> 
</head> 
<h3>Student RegistrationForm</h3> 
<body> 
    <form:form action="submitForm" modelAttribute="registration"> 
     Name: <form:input path="name"  />
              <form:errors path="name" cssClass="c1" ></form:errors>       
        <br><br> 
           
        <br><br>
    
        Roll Number: <form:input path="rollno" type="text" />
         <form:errors path="rollno" cssClass="c1"></form:errors>       
        <br><br>
            
        <br><br> 
        Email: <form:input path="email" /> 
      <form:errors path="email" cssClass="c1" ></form:errors> 
        <br><br> 
      
        Courses: 
        JAVA<form:checkbox path="courses" value="JAVA"/> 
        PYTHON<form:checkbox path="courses" value="PYTHON"/> 
        REACT<form:checkbox path="courses" value="REACT"/> 
          <form:errors path="courses" cssClass="c1" ></form:errors> 
        <br><br> 
       Date: <form:input path="dob"  type="date"/> 
      <form:errors path="dob" cssClass="c1" ></form:errors> 
        <br><br> 
        <input type="submit" value="Submit" /> 
    </form:form> 
</body> 
</html> 
