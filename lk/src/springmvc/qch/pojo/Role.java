package springmvc.qch.pojo;

import java.util.HashSet;
import java.util.Set;

public class Role {
	
	private Integer roleId;
	private String roleName;
	private Set<User> users = new HashSet<User>();
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", users="
				+ users + "]";
	}
}
