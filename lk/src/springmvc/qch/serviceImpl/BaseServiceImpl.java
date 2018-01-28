package springmvc.qch.serviceImpl;

import java.io.Serializable;
import java.util.List;

import springmvc.qch.dao.BaseDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T>{

	private BaseDao<T> baseDao;

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}
	
	@Override
	public T findEntityById(Integer id) throws Exception {
		return baseDao.findEntityById(id);
	}

	@Override
	public void deleteEntity(T t) throws Exception {
		baseDao.deleteEntity(t);
	}

	@Override
	public Serializable addEntity(T t) throws Exception {
		return baseDao.addEntity(t);
	}

	@Override
	public void updateEntity(T t) throws Exception {
		baseDao.updateEntity(t);
	}

	@Override
	public void updateOrSaveEntity(T t) throws Exception {
		baseDao.updateOrSaveEntity(t);
	}

	@Override
	public List<T> getAllEntitys(T t) throws Exception {
		return baseDao.getAllEntitys(t);
	}

	@Override
	public Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) throws Exception {
		return baseDao.getOnePage(clazz, index, max);
	}

	@Override
	public T findEntityById(Class<T> clazz, Integer id) throws Exception {
		return baseDao.findEntityById(clazz, id);
	}

	@Override
	public <T> List<T> getAllEntitys(Class<T> clazz) throws Exception {
		return baseDao.getAllEntitys(clazz);
	}


}
