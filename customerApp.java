package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import cyber.pack1.Customer;

public class customerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Resource is an interface which is implemented by ClassPathResource class
		//this ClassPathResource() contructor takes string as parameter
		//we are valid resource in the form xml
		Resource resource=new ClassPathResource("customer.xml");
		//BeanFactory is an interface which is implemented by XmlBeanFactory class
		//XmlBeanFactory() takes resource object as parameter.
		BeanFactory factory=new XmlBeanFactory(resource);
		
	Customer customerObj=(Customer)	  factory.getBean("obj1");
	customerObj.setCustomerId(10);
	customerObj.setCustomerNmae("abc");
	customerObj.setCustomerPhone(1233434);
	customerObj.setCustomerEmail("abc@gmail.com");
	System.out.println(customerObj);	
	}

}
