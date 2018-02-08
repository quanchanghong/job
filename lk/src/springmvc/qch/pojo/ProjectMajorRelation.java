package springmvc.qch.pojo;

public class ProjectMajorRelation {
	
	private Integer id;
	private Project project;
	private Major major;
	
	private User majorEmployer;//主办工程师

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public User getMajorEmployer() {
		return majorEmployer;
	}

	public void setMajorEmployer(User majorEmployer) {
		this.majorEmployer = majorEmployer;
	}

	@Override
	public String toString() {
		return "ProjectMajorRelation [id=" + id + ", project=" + project
				+ ", major=" + major + ", majorEmployer=" + majorEmployer + "]";
	}

}
