package springmvc.qch.service;

import java.io.Serializable;
import java.util.List;

import springmvc.qch.pojo.Page;

public interface BaseService<T> {
	
	T findEntityById(Integer id) throws Exception;
	
	void deleteEntity(T t) throws Exception;
	
	Serializable addEntity(T t) throws Exception;
	
	void updateEntity(T t) throws Exception;
	
	void updateOrSaveEntity(T t) throws Exception;
	
	List<T> getAllEntitys(T t) throws Exception;
	
	Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) throws Exception;
	
	
}
