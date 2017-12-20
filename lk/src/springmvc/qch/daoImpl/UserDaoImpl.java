package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import springmvc.qch.dao.UserDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;
import springmvc.qch.vo.UserVO;

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
		
		Query query = session.createQuery("from User as u, Role as r, Department as d where u.roleId=r.roleId and u.departmentId=d.departmentId");
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
	
	
}
