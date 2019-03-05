package com.assignement.login.Controller.login;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignement.login.dto.LoginDTO;
import com.assignement.login.dto.RegistationDTO;
import com.assignement.login.service.login.LoginService;


@RequestMapping("/")
@Controller
public class LoginController {
	@Autowired
	private LoginService service;
	
	public LoginController() {
		System.out.println(this.getClass().getSimpleName()+"created");

	 }
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public ModelAndView loginUserController(LoginDTO dto,HttpServletRequest req) {
		System.out.println("LoginUserController Method Starts");
		System.out.println(dto);
		
	    RegistationDTO dtoFromDB = service.loginUserService(dto);
	    if(dtoFromDB!=null) {
	       HttpSession session = req.getSession(true);
	       session.setAttribute("rdto",dtoFromDB);
	    	System.out.println("Valid User,LoginSuccess");
	    	return new ModelAndView("Landing.jsp","nm",dtoFromDB.getMyName());
	    }else {
	    	System.out.println("Invalid User,LoginFailed");
	    	return new ModelAndView("Login.jsp","msg","Invalid Id");
	    }
		
		
		//System.out.println("LoginUserController Method Ends");
	}
	
	
}
