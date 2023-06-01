package com.gopal;
import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
 
public class Student {
    @Size(min=2,max=10,message="Min 2 and max 10 req")
       private String name;
   // @NotNull(message="roll numbe can not be blank")
   // @Size(min=2,max=10,message="Min 2 and max 10 req")
    @Min(message = "Min 2",value = 2)
    @Max(message = "Max 10", value = 10)
       private int rollno;
    @Pattern(regexp="[a-zA-Z0-9_-]+[@]{1}[a-zA-Z]+[.]{1}[ORGorg]{3}",message="Not expected email pattern")
    //abc@gmail.com
  //@Email(message="proper email name required")
       private String email;
    
       @NotEmpty(message = "add your course")
       private String[] courses;
       
       @NotNull(message = "DOB should not be empty")
       @DateTimeFormat(pattern = "yyyy-MM-dd")
       //yyyy-MM-dd
       private LocalDate dob;
       public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getName() {
              return name;
       }
       public void setName(String name) {
              this.name = name;
       }
       public Integer getRollno() {
              return rollno;
       }
       public void setRollno(Integer rollno) {
              this.rollno = rollno;
       }
       public String getEmail() {
              return email;
       }
       public void setEmail(String email) {
              this.email = email;
       }
       public String[] getCourses() {
              return courses;
       }
       public void setCourses(String[] courses) {
              this.courses = courses;
       }
      
      
      
      
      
      
 
}
