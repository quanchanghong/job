package springmvc.qch.dao;

import java.io.Serializable;
import java.util.List;

import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.User;


public interface BaseDao<T> {
	
	T findEntityById(Integer id) throws Exception;
	
	void deleteEntity(T t) throws Exception;
	
	Serializable addEntity(T t) throws Exception;
	
	void updateEntity(T t) throws Exception;
	
	void updateOrSaveEntity(T t) throws Exception;
	
	List<T> getAllEntitys(T t) throws Exception;
	
	Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) throws Exception;

	T findEntityById(Class<T> clazz, Integer id) throws Exception;

	<T> List<T> getAllEntitys(Class<T> clazz) throws Exception;
	
	List<User> getAllSM();
	
	List<User> getAllPM();
	
	List<User> getAllPD();

}
