package springmvc.qch.service;

import java.util.List;

import springmvc.qch.pojo.Department;

public interface DepartmentService {

	List<Department> getDepartmentList();

	Department getDepartByDepartId(int i);

}
