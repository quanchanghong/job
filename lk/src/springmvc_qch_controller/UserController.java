package springmvc_qch_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.service.UserService;

/**
 * �û�ģ���࣬����ʹ��spring�Զ�ע��@autowire��������xml���������Է�����ʾû��set����
 * @author 1500000367-3
 *
 */

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/list")
	public String list(Page<User> page,Model model){
		page.setCurrentPage(0);
		//page.set
		Page<User> p = userService.getAllUsersByPage(page);
		System.out.println(p);
		//model.addAttribute("userList", userList);
		return "user/userList";
	}

}
