package springmvc.qch.serviceImpl;

import springmvc.qch.dao.LoginDao;
import springmvc.qch.pojo.User;
import springmvc.qch.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	@Override
	public User getUserByPwdName(String pwd, String name) throws Exception {
		User user = loginDao.checkUserByPwdAndName(pwd, name);
		return user;
	}

}
