package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//controller is one strestereotype annottaion to mark this plain java class
//as controller class
//The bean of this class is auto detected and scanned by spring container
//The controller class provides web handler method to map the request from client

import com.cyber.Csj28SpringBootDemo2.Flight;
import com.cyber.Csj28SpringBootDemo2.FlightDao;

@Controller
public class AppController {
	@Autowired
	FlightDao dao;

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
	public String  doRegiste
	(@RequestParam("t1") String name, 
			@RequestParam("t2") String dob,
			@RequestParam("t6")String[] courses,
			@RequestParam("t3")String email,
			@RequestParam("t4")String city,
			@RequestParam("t5")String gender, Model m)
	{
		String str=" ";
		for(String s:courses)
		{
			System.out.println(s);
			str=str+ " "+s;
					
		}
		List<String> list=new ArrayList();
		list.add(name);
		list.add(dob);
		list.add(email);
		list.add(city);
		list.add(gender);
		list.add(str);
		m.addAttribute("uerinfo",list);
		/*m.addAttribute("uname", name);
		m.addAttribute("Userdob", dob);
		m.addAttribute("userEmail",email);
		m.addAttribute("userCity",city);
		m.addAttribute("userGender",gender);
		m.addAttribute("userCourses",str);*/
		
		
		return "view";
	}
	@RequestMapping(path="/showFlightPage")
	public String showFlightPage()
	{
		return "flightPage";
	}
	@RequestMapping(path="/addFlight")
	public String addFlight(@ModelAttribute Flight flight,Model m)
	{
		dao.saveFlight(flight);
		return "viewFlight";
	}
	
}
