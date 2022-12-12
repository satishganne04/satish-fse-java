package com.java.ui;

import org.apache.commons.configuration2.AbstractConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.JavaConfiguration;
import com.java.controller.CustomerLoginController;
import com.java.dto.CustomerLoginDTO;

public class UserInterface {

	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);
	
	
	public static void main(String[] args) throws Exception {
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");

		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		CustomerLoginController  customerLoginController = applicationContext.getBean(CustomerLoginController.class);
		try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("harry");
			customerLoginDTO.setPassword("harry123");
			
			
		
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info( config.getProperty(message));
		} catch (Exception exception) {
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
		
		
	}
}
