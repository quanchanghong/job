package springmvc.qch.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserTest {

	@Test
	public void testLogin(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/config/spring_dao.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		jdbcTemplate.execute("insert into user(userId, username, password) values(3,'ÖÐ¹ú','ÄãºÃ')");
	}
	
	

}
