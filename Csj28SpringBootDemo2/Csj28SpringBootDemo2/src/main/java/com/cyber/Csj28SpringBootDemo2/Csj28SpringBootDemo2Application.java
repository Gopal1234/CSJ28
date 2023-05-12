package com.cyber.Csj28SpringBootDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class Csj28SpringBootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Csj28SpringBootDemo2Application.class, args);
	}

}
