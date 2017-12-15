package springmvc.qch.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;

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
				department.setDepartmentLeaderId((String)map.get("departmentLeaderId"));
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

	@Override
	public Department getDepartByDepartId(int departmentId) {
		Department department = null;
		String sql = "select * from  department where departmentId = ?";
		department = template.query(sql, new Object[]{departmentId}, new ResultSetExtractor<Department>() {
			@Override
			public Department extractData(ResultSet rs) throws SQLException,DataAccessException {
				Department d = new Department();
				while (rs.next()){
					d.setDepartmentId(rs.getInt("departmentId"));
					d.setDepartmentName(rs.getString("departmentName"));
					d.setDepartmentLeaderId(rs.getString("departmentLeaderId"));
					d.setDepartmentDesc(rs.getString("departmentDesc"));
					d.setDepartmentPosition(rs.getString("departmentPosition"));
					d.setIsEnd(rs.getInt("isEnd"));
					d.setIsStart(rs.getInt("isStart"));
				}
				return d;
			}
		});
		return department;
	}
}
