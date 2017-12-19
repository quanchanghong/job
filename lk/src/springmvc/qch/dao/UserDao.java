package springmvc.qch.dao;

import java.util.List;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;

public interface UserDao {

	List<User> getAllUsers();

	Page<User> getAllUsersByPage(Page<User> page);

}
