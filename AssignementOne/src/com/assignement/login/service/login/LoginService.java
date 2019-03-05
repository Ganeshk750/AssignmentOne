package com.assignement.login.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignement.login.dao.login.LoginDAO;
import com.assignement.login.dto.LoginDTO;
import com.assignement.login.dto.RegistationDTO;


@Service
public class LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	public LoginService() {
	System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public RegistationDTO loginUserService(LoginDTO dto) {
		System.out.println("LoginUserService Method Starts");
		
	 RegistationDTO dtoFromDB = dao.fatchUser(dto);
		
		System.out.println("LoginUserService Method Ends");
		return dtoFromDB;
	}

}
