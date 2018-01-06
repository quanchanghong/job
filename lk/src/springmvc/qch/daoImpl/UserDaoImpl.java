package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.Department;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.pojo.UserState;
import springmvc.qch.utils.HibernateSessionUtils;
import springmvc.qch.vo.UserVO;
/**
 * userdao使用sessionfactory和hibernatetemplate相关的技术
 * @author 1500000367-3
 *
 */
 @Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	private JdbcTemplate template;
	
	private SessionFactory sessionFactory;

	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from user";
		list = this.getSessionFactory().getCurrentSession().createQuery("from User").list();
		return list;
	}

	@Override
	public Page<UserVO> getAllUsersByPage(Page<UserVO> page) {
		Session session = this.getSessionFactory().getCurrentSession();
		
		Query query = session.createQuery("from User as u, Role as r, Department as d, UserState as us where u.roleId=r.roleId and u.departmentId=d.departmentId and u.state=us.userStateId");
		query.setFirstResult((page.getCurrentPage() - 1) * page.getPageSize());
		query.setMaxResults(page.getPageSize());
		
		List<UserVO> listVO = query.list();
		
		Page<UserVO> showPage = new Page<UserVO>();
		showPage.setList(listVO);
		
		List<Long> rowTotal = session.createCriteria(User.class).setProjection(Projections.count("userId")).list();
		if (rowTotal.size() > 0){
			showPage.setPageTotal(rowTotal.get(0).intValue());
		}
		
		return showPage;
	}

	@Override
	public User deleteUserById(int userId) {
		Session session = HibernateSessionUtils.getCurrentSession(this);
		User user = session.get(User.class, userId);
		if (user != null){
			session.delete(user);
		}
		return user;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> list = null;
		Session session = HibernateSessionUtils.getCurrentSession(this);
		list = session.createQuery(" from Department").list();
		return list;
	}

	@Override
	public List<Role> getAllRoles() {
		List<Role> list = null;
		Session session = HibernateSessionUtils.getCurrentSession(this);
		list = session.createQuery(" from Role").list();
		return list;
	}

	@Override
	public List<UserState> getAllUserStates() {
		List<UserState> list = null;
		Session session = HibernateSessionUtils.getCurrentSession(this);
		list = session.createQuery(" from UserState").list();
		return list;
	}

	@Override
	public Integer saveUserInfo(User user) {
		Session session = HibernateSessionUtils.getCurrentSession(this);
		session.saveOrUpdate(user);
		return 0;
	}

	@Override
	public User getUserById(int userId) {
		return HibernateSessionUtils.getCurrentSession(this).get(User.class, userId);
	}
	
	
}
