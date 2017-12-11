package springmvc.qch.service;

import springmvc.qch.pojo.User;

public interface LoginService {

	User getUserByPwdName(String pwd, String name) throws Exception;

	String findPwdByEmail(String email, String username) throws Exception;

}
