package springmvc_qch_controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import springmvc.qch.pojo.User;
import springmvc.qch.service.LoginService;


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
			//response.sendRedirect("index.jsp");
			return "index";
		}
		
		User user = login.getUserByPwdName(pwd, name);
		if( user != null){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			return "main";
		}else{
			//response.sendRedirect("index.jsp");
			return "index";
		}
		
	}
	
	@RequestMapping("/getPwd")
	public String getPwdByUser(HttpServletResponse response) throws IOException{
		
		return "user/forgetPwd";
	}
	
	@RequestMapping(value="/findPwd", produces="text/html; charset=UTF-8"  )
	@ResponseBody
	public String findPwd(@RequestParam String email, @RequestParam String username, String phone, String code) throws Exception{
		
		if (email.isEmpty() || username.isEmpty()){
			return "用户名或者邮箱为空!";
		}
		
		String pwd = login.findPwdByEmail(email, username);
		if (pwd == null){
			pwd = "用户名或者邮箱不存在!";
		}
		return pwd;
	}

}
