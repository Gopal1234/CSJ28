package com.gopal;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
//import com.example.demo.model.Student;
 
@RequestMapping("/reservation") 
@Controller
 
public class ResgistrationController
{
	
    @RequestMapping("/bookingForm") 
    
    public String bookingForm(Model model) 
    { 
        
        Student stud=new Student(); 
          
        model.addAttribute("registration", stud); 
        return "registration"; 
    } 
    
   
    @RequestMapping("/submitForm") 
    public String submitForm(@ModelAttribute("registration") @Valid Student stud,BindingResult br) 
    { 
          if(br.hasErrors())
          {
               return "registration";
          }
          
        return "welcome"; 
    } 
 
   
    
}
