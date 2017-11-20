package springmvc.qch.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.Transactional;

public class UserTest extends JdbcDaoSupport{

	public void run(){
		JdbcTemplate jdbcTemplate2 = this.getJdbcTemplate();
		
	}
	
	

}
