package springmvc.qch.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Major implements Serializable{

	private static final long serialVersionUID = -7684260622739037649L;
	
	private Integer majorId;
	private String majorCode;
	private String majorName;
	private Set<MajorSys> majorSysSet = new HashSet<MajorSys>();
	/*private Set<ProjectMajorRelation> projectMajorRelations = new HashSet<ProjectMajorRelation>();
	
	public Set<ProjectMajorRelation> getProjectMajorRelations() {
		return projectMajorRelations;
	}
	public void setProjectMajorRelations(
			Set<ProjectMajorRelation> projectMajorRelations) {
		this.projectMajorRelations = projectMajorRelations;
	}*/
	
	public Integer getMajorId() {
		return majorId;
	}
	public Set<MajorSys> getMajorSysSet() {
		return majorSysSet;
	}
	public void setMajorSysSet(Set<MajorSys> majorSysSet) {
		this.majorSysSet = majorSysSet;
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
}
