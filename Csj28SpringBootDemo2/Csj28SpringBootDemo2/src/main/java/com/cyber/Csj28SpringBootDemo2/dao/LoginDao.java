package com.cyber.Csj28SpringBootDemo2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.Csj28SpringBootDemo2.entity.LoginBean;
import com.cyber.Csj28SpringBootDemo2.repository.LoginRepository;
import com.cyber.Csj28SpringBootDemo2.service.LoginService;
@Service
public class LoginDao implements LoginService {
	@Autowired
private LoginRepository repos;
	
	
	
	@Override
	public LoginBean addUser(LoginBean bean) {
	LoginBean beanObj=   repos.save(bean);
		return beanObj;
	}

	@Override
	public LoginBean getLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		LoginBean bean=  repos.login(userName, userPassword);
		return bean;
	}

}
