package com.assignement.login.service.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignement.login.dao.update.UpdateDAO;
import com.assignement.login.dto.RegistationDTO;
import com.assignement.login.dto.UpdateDTO;

@Service
public class UpdateService {
	
	@Autowired
	private UpdateDAO dao;
	
	public UpdateService() {
		
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public int updateUserService(UpdateDTO dto) {
		System.out.println("UpdateUserService Method Starts");
		
        int res = dao.updateUser(dto);
		
		
		System.out.println("UpdateUserService Method Ends");
		return res;
	}

}
