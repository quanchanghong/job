package springmvc.qch.vo;

import javax.management.relation.Role;

import springmvc.qch.pojo.Department;
import springmvc.qch.pojo.User;

public class UserVO {
	
	private Department department;
	private Role role;
	private User user;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserVO [department=" + department + ", role=" + role
				+ ", user=" + user + "]";
	}

}
