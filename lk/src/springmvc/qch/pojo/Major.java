package springmvc.qch.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Major implements Serializable{

	private static final long serialVersionUID = -7684260622739037649L;
	
	private Integer majorId;
	private String majorCode;
	private String majorName;
	private Set<ProjectMajorRelation> projmMjorSet = new HashSet<ProjectMajorRelation>();
	
	public Set<ProjectMajorRelation> getProjmMjorSet() {
		return projmMjorSet;
	}
	public void setProjmMjorSet(Set<ProjectMajorRelation> projmMjorSet) {
		this.projmMjorSet = projmMjorSet;
	}
	public Integer getMajorId() {
		return majorId;
	}
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", majorCode=" + majorCode
				+ ", majorName=" + majorName + "]";
	}

}
