package springmvc.qch.utils;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class HibernateSessionUtils {
	
	public static Session getCurrentSession(HibernateDaoSupport dao){
		Session currentSession = dao.getSessionFactory().getCurrentSession();
		return currentSession;
	}

}
