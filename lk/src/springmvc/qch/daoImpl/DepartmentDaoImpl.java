package springmvc.qch.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import springmvc.qch.dao.DepartmentDao;
import springmvc.qch.pojo.Department;

public class DepartmentDaoImpl implements DepartmentDao {
	
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Department> getDepartmentList() {
		List<Department>  departlist = null;
		
		String sql = "select * from department";
		List<Map<String, Object>> list = template.queryForList(sql);
		if (!list.isEmpty()){
			
			departlist = new ArrayList<Department>();
			
			for (Map<String, Object> map : list) {
				
				Department department = new Department();
				department.setDepartmentId((Integer)map.get("DepartmentId"));
				department.setDepartmentName((String)map.get("departmentName"));
				department.setDepartmentLeaderId((Integer)map.get("departmentLeaderId"));
				department.setDepartmentDesc((String)map.get("departmentDesc"));
				department.setDepartmentPosition((String)map.get("departmentPosition"));
				department.setIsEnd((Integer)map.get("isEnd"));
				department.setIsStart((Integer)map.get("isStart"));
				department.setTopDepartmentId((Integer)map.get("topDepartmentId"));
				department.setNextDepartmentId((Integer)map.get("nextDepartmentId"));
				
				departlist.add(department);
			}
		}
		return departlist;
	}

}
