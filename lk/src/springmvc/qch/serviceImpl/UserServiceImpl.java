package springmvc.qch.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import springmvc.qch.constant.UserConstants;
import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.Department;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.pojo.UserState;
import springmvc.qch.service.UserService;
import springmvc.qch.vo.UserVO;

@Transactional
@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public Page<UserVO> getAllUsersByPage(Page<UserVO> page) {
		return userDao.getAllUsersByPage(page);
	}

	@Override
	public User deleteUserById(int userId) {
		return userDao.deleteUserById(userId);
	}

	@Override
	public Map<String, List> getAllDepartRoleAndStateMap() {
		Map<String, List> map = new HashMap<String, List>();
		List<Department> departments = userDao.getAllDepartments();
		List<Role> roles = userDao.getAllRoles();
		List<UserState> states = userDao.getAllUserStates();
		map.put("department", departments);
		map.put("role", roles);
		map.put("state", states);
		return map;
	}

	@Override
	public Integer saveUserInfo(MultipartFile headerImgFile, User user, MultipartHttpServletRequest multiRequest) throws Exception {
		if (!headerImgFile.isEmpty()){
			File file = new File(UserConstants.USER_HEAD_IMG_BASE_PATH);
			if(!file.exists()){
				try {
					file.mkdirs();
				} catch (Exception e) {
					System.out.println("创建用户头像文件夹失败，信息如下:" + e.getMessage());
					e.printStackTrace();
				}
			}
			
			String userHeadImg = user.getUserName() + "-" + user.getUserCode() + "-" + headerImgFile.getOriginalFilename();
			String imgPath = "//userheadimg" + "//" + userHeadImg;
			
			user.setHeadImageUrl(imgPath);
			
			FileOutputStream fos = new FileOutputStream(imgPath);
			fos.write(headerImgFile.getBytes());
			fos.flush();
			fos.close();
			
		}
		return userDao.saveUserInfo(user);
	}

	@Override
	public User getUserById(int userId) {
		if (userId <= 0){
			return null;
		}
		
		return userDao.getUserById(userId);
	}

}
