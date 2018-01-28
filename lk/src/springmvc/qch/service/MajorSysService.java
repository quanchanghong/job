package springmvc.qch.service;

import java.util.Map;

import springmvc.qch.pojo.MajorSys;

public interface MajorSysService extends BaseService<MajorSys>{

	Map<String, Object> getMajorSysEditMap(Integer majorSysId) throws Exception;

}
