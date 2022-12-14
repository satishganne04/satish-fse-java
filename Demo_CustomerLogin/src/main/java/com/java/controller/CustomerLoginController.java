package com.java.controller;

import org.springframework.stereotype.Component;

import com.java.dto.CustomerLoginDTO;
import com.java.exception.InfyBankException;
import com.java.service.CustomerLoginService;
import com.java.service.CustomerLoginServiceImpl;
@Component
public class CustomerLoginController {

	private CustomerLoginService customerLoginService;

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		customerLoginService=new CustomerLoginServiceImpl();
		return customerLoginService.authenticateCustomer(customerLoginDTO);
	}
}
