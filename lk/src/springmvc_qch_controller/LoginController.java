package springmvc_qch_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String  userLogin(){
		System.out.println("receive!!!");
		return "main";
	}

}
