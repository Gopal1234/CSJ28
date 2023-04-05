package annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import pack1.demo.Address;
//Component annotation indicate to auto detect and scan the bean
//by spring container
//it instantiate the bean for annotated class
//it is class level annotation
// the default name of the bean is decapotilazied class
//student
//spring container maintains this bean and wheneevr we need it 
//inject or initialize that bean

@Component("studentObj")
public class Student {
	
	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + ", studentMarks="
				+ studentMarks + "]";
	}
	//@Value annotation is used to set the default value for fields or properties
	@Value("8")
	private int studentRollNumber;
	@Value("Ankit")
	private String studentName;
	@Value("90")
	private int studentMarks;
	//@Autowired annotation is used to inject the bean or object to
	//dependent fields or properties
	//we can apply @Autowired annotation with field, setter method and constructoe
	//@Autowired
	private Address address;
	@Autowired
	//It is used to set the Qualified bean name to the reference
	@Qualifier("nonTechnical")
	
	private Course course;//=new TechnicalCourse();
	
	
	
	//@Autowired not allowed
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	public String displayCourse()
	{
		return course.showCourse();
	}
	
	
	

}
