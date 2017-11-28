package springmvc_qch_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.service.LoginService;
import springmvc.qch.serviceImpl.LoginServiceImpl;


@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String  userLogin(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("login-name").trim();
		String pwd = request.getParameter("login-pass").trim();
		if (name.isEmpty() || pwd.isEmpty()){
			return "error";
		}
		
		LoginService login = new LoginServiceImpl();
		return "main";
	}

}
