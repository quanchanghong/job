package springmvc.qch.service;

import java.util.List;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.vo.UserVO;

public interface UserService {

	List<User> getAllUsers();

	Page<UserVO> getAllUsersByPage(Page<UserVO> page);

}
