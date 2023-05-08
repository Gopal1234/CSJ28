package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/home")  
	public String redirect()  
    {  
        return "viewPage";  
    }    
	@RequestMapping("/hi")  
	public String display()  
	{  
	    return "final";  
	}  
	
}
