package springmvc.qch.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springmvc.qch.dao.LoginDao;
import springmvc.qch.pojo.User;

public class LoginDaoImpl implements LoginDao{
	
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public User checkUserByPwdAndName(String pwd, String name) throws Exception {
		User user = null;
		String sql = "select * from user where userName = ? and password = ?";
		try{
			user = template.queryForObject(sql, new Object[]{name, pwd}, new RowMapper<User>() {

				@Override
				public User mapRow(ResultSet rs, int rownumber) throws SQLException {
					User u = new User();
		
					u.setUserName(rs.getString("userName"));
					u.setUserId(rs.getInt("userId"));
					u.setPassword(rs.getString("password"));
	
					return u;
				}
			});
		}catch(Exception e){
			System.out.println("qchexception:" + this.getClass().getName() + ":" +e.getMessage());
		}
		
		return user;
	}


}
