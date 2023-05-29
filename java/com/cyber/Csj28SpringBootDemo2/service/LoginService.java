package com.cyber.Csj28SpringBootDemo2.service;

import com.cyber.Csj28SpringBootDemo2.entity.LoginBean;

public interface LoginService {
	
	
	LoginBean addUser(LoginBean bean);
	LoginBean getLogin(String userName, String userPassword);

}
