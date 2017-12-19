package springmvc.qch.service;

import java.util.List;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;

public interface UserService {

	List<User> getAllUsers();

	Page<User> getAllUsersByPage(Page<User> page);

}
