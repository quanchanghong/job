package springmvc_qch_controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.service.UserService;
import springmvc.qch.vo.UserVO;

/**
 * 用户模块类，属性使用spring自动注入@autowire，不能在xml中配置属性否则提示没有set方法
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
	
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam String userId){
		User user = userService.deleteUserById(Integer.parseInt(userId));
		return "redirect:list";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model){
		Map<String, List> departRoleAndStateMap = userService.getAllDepartRoleAndStateMap();
		model.addAttribute("departRoleAndStateMap", departRoleAndStateMap);
		//System.out.println(departRoleAndStateMap.toString());
		return "user/userAdd";
	}
	
	@RequestMapping(value="/save")
	public String save(@RequestParam("header") MultipartFile headerImgFile, User user, HttpServletRequest request) throws Exception{
		MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
		Integer id = userService.saveUserInfo(headerImgFile, user, multiRequest);
		return "redirect:list";
	}
	
	@RequestMapping(value="edit")
	public String edit(@RequestParam String userId, Model model){
		Map<String, Object> userMap = userService.getUserMapById(Integer.parseInt(userId));
		model.addAttribute("userEditMap",userMap);
		return "user/userEdit";
	}
	
	@RequestMapping(value="update")
	public String updateUser(@RequestParam String userId, User user){
		Integer counts = userService.updateUserByUser(user);
		return "redirect:list";
	}

}
