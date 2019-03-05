package com.assignement.login.service.forgotten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignement.login.dao.forgotten.ForgottenDAO;
import com.assignement.login.dto.ForgottenDTO;

@Service
public class ForgottenService {
	
	@Autowired
	private ForgottenDAO dao;
	
	public ForgottenService() {
		
    System.out.println(this.getClass().getSimpleName()+"created");
    
	}
	    public int forgottenService(ForgottenDTO dto) {
	    	
		System.out.println("ForgottenService Method Starts");
		
	     int res = dao.forgottenUser(dto);
		
		System.out.println("ForgottenService Method Ends");
		return res;
		
	}

}
