package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
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
	public Page<User> getAllUsersByPage(Page<User> page) {
		Session session = this.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		
		if ((page.getCurrentPage() == null) || (page.getCurrentPage() <= 1)){
			criteria.setFirstResult(0);
		}
		else{
			criteria.setFirstResult(page.getCurrentPage() * page.getPageSize());
		}
		
		criteria.setMaxResults((page.getCurrentPage() + 1) * page.getPageSize());
		List<User> list = criteria.list();
		
		
		
		Page<User> p = new Page<User>();
		p.setList(list);
		System.out.println(p.getList());
		List<Integer> list2 = session.createCriteria(User.class).setProjection(Projections.count("userId")).list();
		if (list2.size() > 0){
			//p.setPageTotal(Integer.);
		}
		
		return p;
	}
	
	
}
