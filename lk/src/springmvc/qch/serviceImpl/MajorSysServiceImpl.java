package springmvc.qch.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import springmvc.qch.dao.MajorSysDao;
import springmvc.qch.pojo.Major;
import springmvc.qch.pojo.MajorSys;
import springmvc.qch.service.MajorSysService;

public class MajorSysServiceImpl extends BaseServiceImpl<MajorSys> implements MajorSysService{
	private MajorSysDao majorSysDao;

	public void setMajorSysDao(MajorSysDao majorSysDao) {
		this.majorSysDao = majorSysDao;
	}

	@Override
	public Map<String, Object> getMajorSysEditMap(Integer majorSysId) throws Exception {
		Map<String, Object> map = null;
		MajorSys majorSys = majorSysDao.findEntityById(majorSysId);
		if (majorSys != null){
			map = new HashMap<String, Object>();
			List<Major> majorList = majorSysDao.getAllEntitys(Major.class);
			map.put("majorSys", majorSys);
			map.put("majorList", majorList);
		}
		return map;
	}
	
}
