package springmvc.qch.dao;

import springmvc.qch.pojo.User;

public interface LoginDao {
	
	public User checkUserByPwdAndName() throws Exception;

}
