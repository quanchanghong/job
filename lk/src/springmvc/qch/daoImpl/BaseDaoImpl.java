package springmvc.qch.daoImpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import springmvc.qch.dao.BaseDao;

@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{

	private Class<T> entityClazz;
	
	public BaseDaoImpl(){
		Type type = this.getClass().getGenericSuperclass();
		if (type instanceof ParameterizedType){
			 this.entityClazz = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
		}
	}
	
//	@Resource
//	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
//		super.setSessionFactory(sessionFactory);
//	}
	
	public Session getCurrentSession(){
		return this.getSessionFactory().getCurrentSession();
	}
	
	@Override
	public T findEntityById(Integer id) throws Exception {
		
		return getCurrentSession().get(entityClazz, id);
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
	
	
	
	

}
