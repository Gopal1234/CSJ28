package com.cyber.Csj28SpringBootDemo2.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cyber.Csj28SpringBootDemo2.Flight;
import com.cyber.Csj28SpringBootDemo2.entity.LoginBean;

public interface LoginRepository   extends JpaRepository<LoginBean, Integer>{

	@Query("select bean from LoginBean bean where userName=:p1 and userPassword=:p2")
	public LoginBean login(@Param("p1") String userName, @Param("p2")String password);
	
	
	
	
}
