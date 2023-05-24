package com.cyber.Csj28SpringBootDemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyber.Csj28SpringBootDemo2.dao.LoginDao;
import com.cyber.Csj28SpringBootDemo2.entity.LoginBean;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDao dao;
	@RequestMapping("/userPage")
	public String showMyUserPage()
	{
		return "userInput";
	}
	
	@RequestMapping(path="/addUser", method=RequestMethod.POST)
	//@ResponseBody
	public String addUser(@ModelAttribute LoginBean  bean, Model m)
	{
		   LoginBean obj=dao.addUser(bean);
		 if(obj!=null)
		 {
		return "login";
		
		 }else
		 {
			 return "loginError";
		 }
	}
	@RequestMapping(path="/loginUser", method=RequestMethod.POST)
	public String getLogin(@RequestParam("t1") String userName, @RequestParam("t2") String userPassword)
	{
		
	LoginBean bean=	dao.getLogin(userName, userPassword);
	
	if(bean!=null && bean.getUserType().equals("admin"))
	{
	 return "adminPage";
	}else if(bean!=null && bean.getUserType().equals("customer"))
	{
		return "customerPage";
	}
	else
	{
		return "loginErrorPage";
	}
	}
	

}
