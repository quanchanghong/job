package springmvc.qch.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.vo.UserVO;

public interface UserService {

	List<User> getAllUsers();

	Page<UserVO> getAllUsersByPage(Page<UserVO> page);

	User deleteUserById(int userId);

	Map<String, List> getAllDepartRoleAndStateMap();

	Integer saveUserInfo(MultipartFile headerImgFile, User user, MultipartHttpServletRequest multiRequest) throws Exception;

	Map<String, Object> getUserMapById(int parseInt);

	Integer updateUserByUser(User user);

}
