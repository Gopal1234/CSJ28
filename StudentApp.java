package annotation.demo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack1.demo.Address;

public class StudentApp {

	public static void main(String[] args) {
//AnnotationConfigApplicationContext is one of the implementation class which implements 
//application context.
// in the constructor of this class we pass the valid class name with .class extentention
//configuration class should be annotated with @Configuration annotation		
		
ApplicationContext context=
new AnnotationConfigApplicationContext(StudentConfig.class);
 /* Student student=context.getBean("studentObj", Student.class);
		System.out.println(student);
		 Address address=  student.getAddress();
		System.out.println(address);
		String courseDetails=student.displayCourse();
		System.out.println(courseDetails);*/

Student s1=context.getBean("student1",Student.class);
Scanner scanner=new Scanner(System.in);
s1.setStudentRollNumber(scanner.nextInt());
s1.setStudentName(scanner.next());
s1.setStudentMarks(scanner.nextInt());

System.out.println(s1);


Student s2=context.getBean("student2",Student.class);
s2.setStudentRollNumber(scanner.nextInt());
s2.setStudentName(scanner.next());
s2.setStudentMarks(scanner.nextInt());
System.out.println(s2);


				
	}

}
