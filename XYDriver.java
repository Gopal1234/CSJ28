package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cyber.pack1.Y;

public class XYDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("XY.xml");
	Y yObj=	context.getBean("y",Y.class);
String msg=	 yObj.showMsg();
	System.out.println(msg);
	
	}

}
