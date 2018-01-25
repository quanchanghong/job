package springmvc.qch.service;

import springmvc.qch.pojo.Page;

public interface baservice<T> {
	
	void abc();
	Page<T> getOnePage(Class<T> clazz, Integer index, Integer max) throws Exception;
}
