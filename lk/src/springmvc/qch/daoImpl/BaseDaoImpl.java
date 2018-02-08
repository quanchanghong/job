package springmvc.qch.daoImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import springmvc.qch.dao.BaseDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.Role;
import springmvc.qch.pojo.User;


public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{

	private Class<T> entityClazz;
	
	public BaseDaoImpl(){
		
		Type type = this.getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType){
			 this.entityClazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
		}
	}
	
	@Resource
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public Session getCurrentSession(){
		return this.getSessionFactory().getCurrentSession();
	}
	
	@Override
	public T findEntityById(Class<T> clazz,Integer id) throws Exception {
		
		return this.getCurrentSession().get(clazz, id);
	}

	@Override
	public void deleteEntity(T t) throws Exception {
		getCurrentSession().delete(t);
	}

	@Override
	public Serializable addEntity(T t) throws Exception {
		
		return getCurrentSession().save(t);
		
	}

	@Override
	public void updateEntity(T t) throws Exception {
		getCurrentSession().update(t);
		
	}

	@Override
	public void updateOrSaveEntity(T t) throws Exception {
		getCurrentSession().saveOrUpdate(t);
	}

	@Override
	public List<T> getAllEntitys(T t) {
		String hql = "from " + entityClazz.getSimpleName();
		return getCurrentSession().createQuery(hql).list();
	}

	@Override
	public Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) {
		Page<T> page = new Page<T>();
		Session session = this.getCurrentSession();
		
		Criteria criteria = session.createCriteria(clazz);
		criteria.setFirstResult((index - 1) * page.getPageSize());
		criteria.setMaxResults(max);
		List<T> list = criteria.list();
		if (list.size() > 0 && list != null){
			page.setList(list);
		}
		
		Criteria criteriaCount = session.createCriteria(clazz);
		List<Long> countList = criteriaCount.setProjection(Projections.rowCount()).list();
		if (countList.size() > 0 && countList != null){
			page.setPageTotal(countList.get(0).intValue());
		}
		
		page.setCurrentPage(index);
		
		return page;
	}

	@Override
	public T findEntityById(Integer id) throws Exception {
		return getCurrentSession().get(entityClazz, id);
	}

	@Override
	public <T> List<T> getAllEntitys(Class<T> clazz) throws Exception {
		String hql = " from " + clazz.getSimpleName();
		return getCurrentSession().createQuery(hql).list();
	}

	@Override
	public List<User> getAllSM() {
		List<User> userList = null;
		String hql = "from Role where roleName = 'SM'";
		List<Role> list = getCurrentSession().createQuery(hql).list();
		if (list != null && list.size() > 0){
			userList = new ArrayList<User>(list.get(0).getUsers());
		}
		return userList;
	}

	@Override
	public List<User> getAllPM() {
		List<User> userList = null;
		String hql = "from Role where roleName = 'PM'";
		List<Role> list = getCurrentSession().createQuery(hql).list();
		if (list != null && list.size() > 0){
			userList = new ArrayList<User>(list.get(0).getUsers());
		}
		return userList;
	}

	@Override
	public List<User> getAllPD() {
		List<User> userList = null;
		String hql = "from Role where roleName = 'PD'";
		List<Role> list = getCurrentSession().createQuery(hql).list();
		if (list != null && list.size() > 0){
			userList = new ArrayList<User>(list.get(0).getUsers());
		}
		return userList;
	}

}
