package springmvc.qch.serviceImpl;

import java.util.List;

import springmvc.qch.dao.DepartmentDao;
import springmvc.qch.pojo.Department;
import springmvc.qch.service.DepartmentService;

public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService {
	
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public List<Department> getDepartmentList() {
		return departmentDao.getDepartmentList();
	}


	@Override
	public Department getDepartByDepartId(int departmentId) {
		return departmentDao.getDepartByDepartId(departmentId);
	}

	@Override
	public Department updateDepart(Department department) {
		return departmentDao.updateDepart(department);
	}

}
