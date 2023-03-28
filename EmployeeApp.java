package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cyber.pack1.Employee;
import cyber.pack1.Task;

public class EmployeeApp {

	public static void main(String[] args) {


      //creating instance of application context by initializing the valid implementation class object
		//called ClassPathXMlApplicationContext
		ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		//by using the object of application context , invoking getBean(String beanName) and return type is Object
		//type
		//since we need the object of employee that's why we are type casting int employee class
		//Employee e1=(Employee)context.getBean("empObj");
		//if you do not want to typecast the object, because type casting may leads loosing the data, then you can use
		 //getBean(String beanName, class name)---return the object that given class
		     Employee e1=context.getBean("empObj", Employee.class);
		     
		     
		//printing the employee object returned by spring container
		System.out.println(e1);
		
		List<Task> t=e1.getListOfTask();
		for(Task tobj:t)
		{
			System.out.println(tobj.getTaskId() + " "+tobj.getTaskName());
		}
		
		

	}

}
