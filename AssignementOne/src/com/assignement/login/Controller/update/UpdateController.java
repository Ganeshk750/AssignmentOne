package com.assignement.login.Controller.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignement.login.dto.RegistationDTO;
import com.assignement.login.dto.UpdateDTO;
import com.assignement.login.service.update.UpdateService;


@RequestMapping("/")
@Controller
public class UpdateController {

	@Autowired
	private UpdateService service;

	public UpdateController() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public ModelAndView updateUserController(UpdateDTO dto) {

		System.out.println("UpdateUserController Method Starts");


		System.out.println(dto);

		int res = service.updateUserService(dto);
		if(res == 1) {
			System.out.println("Valid User,Updade Success");
			return new ModelAndView("Login.jsp","msg","Update Succesfully");
		}
		 else {
			System.out.println("Invalid User,Login failed");
			return new ModelAndView("Forgotten.jsp","msg","Invalid Id");
		

			//System.out.println("UpdateUserController Method Ends");
		}
	}
}

