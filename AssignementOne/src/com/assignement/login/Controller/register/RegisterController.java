package com.assignement.login.Controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignement.login.dto.RegistationDTO;
import com.assignement.login.service.register.RegisterService;


@RequestMapping("/")
@Controller
public class RegisterController {
	@Autowired
	private  RegisterService service;
	
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName()+"creted");
	}
	@RequestMapping(value="Registation.do",method=RequestMethod.POST)
	public String registerUserController(RegistationDTO dto) {
		System.out.println("RegisterUserController Method Starts");
		
		
		service.registerUserService(dto);
		
		System.out.println("RegisterUserController Method Ends");
		return "/Login.jsp";
	}

}
