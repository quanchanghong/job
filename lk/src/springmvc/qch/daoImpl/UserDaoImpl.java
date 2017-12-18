package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.User;

 @Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		list = template.queryForList(sql, User.class);
		return list;
	}
}
