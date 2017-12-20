package springmvc_qch_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.service.UserService;
import springmvc.qch.vo.UserVO;

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
	public String list(Page<UserVO> page,Model model){
		
		Page<UserVO> onePage = userService.getAllUsersByPage(page);
		onePage.setCurrentPage(page.getCurrentPage());
		model.addAttribute("onePage", onePage);
		return "user/userList";
	}

}
