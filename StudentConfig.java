package annotation.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// @Configuration annonation indicate that the given class is configuration class
//@ComponentScan annotation is used along with @Configuration annotation to indicate 
//that packages of component by which spring container can scan and detect
@Configuration
@ComponentScan(basePackages = {"annotation.demo","pack1.demo"})
public class StudentConfig {
	
	@Bean
	public Student  student1()
	{
		return new Student();
	}
	@Bean
	public Student  student2()
	{
		return new Student();
	}
	

}
