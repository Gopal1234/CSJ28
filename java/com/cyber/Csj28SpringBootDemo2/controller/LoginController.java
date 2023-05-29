package com.cyber.Csj28SpringBootDemo2.controller;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyber.Csj28SpringBootDemo2.dao.LoginDao;
import com.cyber.Csj28SpringBootDemo2.entity.LoginBean;

@Controller
@SessionAttributes("userKey")
public class LoginController {
	
	@Autowired
	private LoginDao dao;
	
	@RequestMapping(path="/")
	public String startApp()
	{
		return "login";
	}
	
	
	@RequestMapping("/userPage")
	public String showMyUserPage()
	{
		return "userInput";
	}
	
	@RequestMapping(path="/addUser", method=RequestMethod.POST)
	@ResponseBody
	public String addUser(@ModelAttribute LoginBean  bean, Model m)
	{
		   LoginBean obj=dao.addUser(bean);
		 if(obj!=null)
		 {
		return "<h1> Congratulation </h1>"+ 
		 " " +obj.getUserName()+ " "+ "<a href='login.jsp'>Login Here...</a>";
		
		 }else
		 {
			 return "<h1>Error in Page.....</h>";
		 }
	}
	@RequestMapping(path="/loginUser", method=RequestMethod.POST)
	public String getLogin(@RequestParam("t1") String userName, @RequestParam("t2") String userPassword,Model model)
	{
		
	LoginBean bean=	dao.getLogin(userName, userPassword);
	
	if(bean!=null && bean.getUserType().equals("admin"))
	{
		model.addAttribute("userKey", bean.getUserName());
	 return "adminPage";
	}else if(bean!=null && bean.getUserType().equals("customer"))
	{
		model.addAttribute("userKey", bean.getUserName());
		return "customerPage";
	}
	else
	{
		return "loginErrorPage";
	}
	}
	
     
	
	
	
}
