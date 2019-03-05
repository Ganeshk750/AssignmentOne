package com.assignement.login.service.register;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignement.login.dao.register.RegisterDAO;
import com.assignement.login.dto.RegistationDTO;




@Service
public class RegisterService {
	@Autowired
	private RegisterDAO dao;
	
	public RegisterService() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void registerUserService(RegistationDTO dto) {
		System.out.println("RegisterUserService Method Starts");
		
		
		dao.saveUser(dto);
		
		
		System.out.println("RegisterUserService Method Ends");
	}
}