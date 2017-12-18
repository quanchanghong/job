package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.User;

 @Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	private JdbcTemplate template;
	

	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		list = this.getSessionFactory().getCurrentSession().createQuery("from User u").list();
		return list;
	}
}
