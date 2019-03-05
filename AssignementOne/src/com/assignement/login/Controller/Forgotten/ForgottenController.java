package com.assignement.login.Controller.Forgotten;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignement.login.dto.ForgottenDTO;
import com.assignement.login.service.forgotten.ForgottenService;

@RequestMapping("/")
@Controller
public class ForgottenController {
	
	@Autowired
	private ForgottenService service;
	
	public ForgottenController() {
		
    System.out.println(this.getClass().getSimpleName()+"created");
    
	}
	@RequestMapping(value="forgotten.do",method=RequestMethod.POST)
	public ModelAndView forgottenUserController(ForgottenDTO dto) {
		System.out.println("ForgottenUserController Method Starts");
		System.out.println(dto);
		
		int res = service.forgottenService(dto);
		if(res == 1) {
			System.out.println("Valid User,Change Success");
			return new ModelAndView("Login.jsp","msg","Change password succesfully..");
		}
		else {
			System.out.println("Invalid User,Change failed");
			return new ModelAndView("Forgotten.jsp","msg","Invalid email-id");
		}
		
		//System.out.println("ForgottenUserController Method Ends");
	}

}
