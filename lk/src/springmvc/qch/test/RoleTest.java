package springmvc.qch.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springmvc.qch.dao.UserDao;
import springmvc.qch.daoImpl.UserDaoImpl;

public class RoleTest {
	
	@Test
	public void testRoleInsertSql(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/spring_dao.xml");
		UserDaoImpl dao = (UserDaoImpl) ctx.getBean("userDaoImpl");
		//dao.insert(null);
	}

}
