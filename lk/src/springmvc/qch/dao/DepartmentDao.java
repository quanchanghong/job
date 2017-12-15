package springmvc.qch.dao;

import java.util.List;

import springmvc.qch.pojo.Department;

public interface DepartmentDao {

	List<Department> getDepartmentList();

	Department getDepartByDepartId(int departmentId);

}
