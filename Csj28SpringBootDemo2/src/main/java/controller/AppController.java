package controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//controller is one strestereotype annottaion to mark this plain java class
//as controller class
//The bean of this class is auto detected and scanned by spring container
//The controller class provides web handler method to map the request from client

@Controller
public class AppController {

	//displaySinUpPage is a web handler method
	//this method annotated with RequestMammping annotation
	//the given annotation is class level and method level annotation
	//the RequestMapping annotation is used to map the request 
	//from client 
	//by using path attribute
	//It also use some more important attributes like
	//method=RequestMethod.GET,RequestMethod.POST
	//it uses one attribute called produces=MediaType.TEXT_HTML_VALUE , 
	//to produce response body in that same MIME type
	
	@RequestMapping(path="/")
	//@ResponseBody
	public String displaySignUpPage()
	{
		//return "<h1>"+"welcome to wipro"+"</h1>";
		return "signup";
	}
	@RequestMapping(path="/signupPage", method = RequestMethod.POST)
	public String  doRegiste(@RequestParam("t1") String name, @RequestParam("t2") String dob,@RequestParam("t6")String[] courses)
	{
		
		System.out.println(name + " "+dob+" "+ courses);
		
		return "view";
	}
	
	
}
