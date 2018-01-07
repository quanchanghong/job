package springmvc.qch.dao;

import java.util.List;

import javax.management.relation.Role;

import springmvc.qch.pojo.Department;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.pojo.UserState;
import springmvc.qch.vo.UserVO;

public interface UserDao {

	List<User> getAllUsers();

	Page<UserVO> getAllUsersByPage(Page<UserVO> page);

	User deleteUserById(int userId);

	List<Department> getAllDepartments();

	List<Role> getAllRoles();

	List<UserState> getAllUserStates();

	Integer saveUserInfo(User user);

	User getUserById(int userId);

	Integer updateUserByUser(User user);

	String getUserHeadImgPathById(Integer userId);

}
