package springmvc_qch_controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.pojo.User;
import springmvc.qch.service.LoginService;
import springmvc.qch.serviceImpl.LoginServiceImpl;


@Controller
public class LoginController {
	
	private LoginService login;
	
	public void setLogin(LoginService login) {
		this.login = login;
	}


	@RequestMapping("/login")
	public String  userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String name = request.getParameter("login-name").trim();
		String pwd = request.getParameter("login-pass").trim();
		if (name.isEmpty() || pwd.isEmpty()){
			response.sendRedirect("index.jsp");
			return null;
		}
		
		User user = login.getUserByPwdName(pwd, name);
		if( user != null){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			return "main";
		}else{
			response.sendRedirect("index.jsp");
			return null;
		}
		
	}

}
