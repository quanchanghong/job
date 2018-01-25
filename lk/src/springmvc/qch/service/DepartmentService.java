package springmvc.qch.service;

import java.util.List;

import springmvc.qch.pojo.Department;

public interface DepartmentService extends BaseService<Department>{

	List<Department> getDepartmentList();

	Department getDepartByDepartId(int i);

	Department updateDepart(Department department);

}
