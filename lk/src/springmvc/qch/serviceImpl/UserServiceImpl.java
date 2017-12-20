package springmvc.qch.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
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

}
