package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cyber.pack1.User;

public class TestUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Properties is  a sub class of HashTable which resides in java.util package
		//before HashMap we use these Proerties class to store data in key and value
		//we can instantiate the object of Properties class using 
		//Properties p =new Properties();
		//we can get the properties class object by using System.getProperties() method
		//which returns the obejct of properties by defining all java details
Properties p=new Properties();
Scanner scanner=new Scanner(System.in);
System.out.println("Enter user name");
String userName=scanner.nextLine();
System.out.println("Enter password");
String password=scanner.nextLine();
//by using put method we can addd object as key and value pair in properites
p.put("userKey", userName);
p.put("passKey", password);
//we can create any type of File by invoking constructor of FileOutputStream
FileOutputStream output=new FileOutputStream("./src/main/resources/user.properties");
System.out.println("file created");
// by using store method of properties class we can write content of properties in a specified file object

p.store(output, "loaded");
ApplicationContext context=new ClassPathXmlApplicationContext("user.xml");
User user=context.getBean("userObj", User.class);
String userName1=user.getUserName();
String password1=user.getUserPassword();

System.out.println(userName1 + " "+password1);


	}

}
