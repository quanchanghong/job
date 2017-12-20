package springmvc.qch.dao;

import java.util.List;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.vo.UserVO;

public interface UserDao {

	List<User> getAllUsers();

	Page<UserVO> getAllUsersByPage(Page<UserVO> page);

}
