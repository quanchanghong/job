package springmvc.qch.serviceImpl;

import springmvc.qch.dao.MajorDao;
import springmvc.qch.pojo.Major;
import springmvc.qch.service.MajorService;

public class MajorServiceImpl extends BaseServiceImpl<Major> implements MajorService {

	private MajorDao majorDao;

	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}

}
