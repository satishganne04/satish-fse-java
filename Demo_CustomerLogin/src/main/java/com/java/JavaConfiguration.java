package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.controller.CustomerLoginController;




@Configuration

public class JavaConfiguration {
	
	@Bean
	public CustomerLoginController customerLoginController() {
		return new CustomerLoginController();
		
	}

}
