package springmvc.qch.serviceImpl;

import springmvc.qch.dao.BaseDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.service.aaaaaaa;
import springmvc.qch.service.baservice;

public class baserviceImpl<T> implements baservice<T> {
	
	private aaaaaaa a;
	private BaseDao<T> baseDao;

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	public void setA(aaaaaaa a) {
		this.a = a;
	}

	@Override
	public void abc() {
		System.out.println("abc");
		a.hi();

	}
	@Override
	public Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) throws Exception {
		System.out.println("baseservice!");
		return baseDao.getOnePage(clazz, index, max);
	}
}
