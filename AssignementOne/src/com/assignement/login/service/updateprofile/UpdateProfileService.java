package com.assignement.login.service.updateprofile;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignement.login.dao.updateprofile.UpdateProfileDAO;
import com.assignement.login.dto.RegistationDTO;

@Service
public class UpdateProfileService {
	
	    @Autowired
        private UpdateProfileDAO dao;
	    
	public UpdateProfileService() {
		
		System.out.println(this.getClass().getSimpleName()+"Created");
	}
	
	public int updateProfileService(RegistationDTO dto,HttpServletRequest req) {
		System.out.println("UpdateProfileService Method Starts");
		
		
		int res  = dao.updateProfile(dto,req);
	
		
		System.out.println("UpdateProfileService Method Ends");
		return res;
	}


}
