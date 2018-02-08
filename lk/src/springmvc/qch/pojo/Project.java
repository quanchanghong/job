package springmvc.qch.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToOne;

public class Project {
	
	private Integer projId;
	private String projName;
	private String projShortName;
	private String projMark;
	private String projCode;
	
	private User projSM;
	private User projPM;
	private User projPD;
	
	private String projStart;
	private String projEnd;
	private String projCreate;
	private User creator;
	
	//private Set<Major> projmMjorSet = new HashSet<Major>();
	private Set<ProjectMajorRelation> projectMajorRelations = new HashSet<ProjectMajorRelation>();

	public Set<ProjectMajorRelation> getProjectMajorRelations() {
		return projectMajorRelations;
	}

	public void setProjectMajorRelations(
			Set<ProjectMajorRelation> projectMajorRelations) {
		this.projectMajorRelations = projectMajorRelations;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjShortName() {
		return projShortName;
	}

	public void setProjShortName(String projShortName) {
		this.projShortName = projShortName;
	}

	public String getProjMark() {
		return projMark;
	}

	public void setProjMark(String projMark) {
		this.projMark = projMark;
	}

	public String getProjCode() {
		return projCode;
	}

	public void setProjCode(String projCode) {
		this.projCode = projCode;
	}

	public User getProjSM() {
		return projSM;
	}

	public void setProjSM(User projSM) {
		this.projSM = projSM;
	}

	public User getProjPM() {
		return projPM;
	}

	public void setProjPM(User projPM) {
		this.projPM = projPM;
	}

	public User getProjPD() {
		return projPD;
	}

	public void setProjPD(User projPD) {
		this.projPD = projPD;
	}

	public String getProjStart() {
		return projStart;
	}

	public void setProjStart(String projStart) {
		this.projStart = projStart;
	}

	public String getProjEnd() {
		return projEnd;
	}

	public void setProjEnd(String projEnd) {
		this.projEnd = projEnd;
	}

	public String getProjCreate() {
		return projCreate;
	}

	public void setProjCreate(String projCreate) {
		this.projCreate = projCreate;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	/*public Set<Major> getProjmMjorSet() {
		return projmMjorSet;
	}

	public void setProjmMjorSet(Set<Major> projmMjorSet) {
		this.projmMjorSet = projmMjorSet;
	}*/

}
