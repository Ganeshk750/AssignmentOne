package com.assignement.login.Controller.updateprofile;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.*;
import com.assignement.login.dto.LoginDTO;
import com.assignement.login.dto.RegistationDTO;
import com.assignement.login.service.updateprofile.UpdateProfileService;

@RequestMapping("/")
@Controller
public class UpdateProfileController extends HttpServlet {
	
	@Autowired
	private UpdateProfileService service;
	
	public UpdateProfileController() {
		
		System.out.println(this.getClass().getSimpleName()+"Created");
	}
	
	@RequestMapping(value="UpdateProfile.do",method=RequestMethod.POST)
	public ModelAndView updateProfileController(RegistationDTO rdto,HttpServletRequest req) {
		
		System.out.println("UpdateProfileController Method Starts");
		System.out.println(rdto);
		
		 RegistationDTO dtoFromDB = null;
		 HttpSession session = req.getSession(false);
		 service.updateProfileService( rdto, req);
		 dtoFromDB = (RegistationDTO)session.getAttribute("rdto");
		 int pk = dtoFromDB.getId();
		 rdto.setId(pk);
			System.out.println("Valid User,UserProfile Updated Successfully");
			return new ModelAndView ("Landing.jsp","msg","Updated Successfully");
		}
		
		
		//System.out.println("UpdateProfileController Method Ends");
	}

