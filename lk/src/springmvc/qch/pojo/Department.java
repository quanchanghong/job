package springmvc.qch.pojo;

public class Department {
	
	private Integer departmentId;
	private String departmentName;
	private Integer departmentLeaderId;
	private String departmentDesc;
	private String departmentPosition;
	private Integer isEnd;
	private Integer isStart;
	private Integer topDepartmentId;
	private Integer nextDepartmentId;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getDepartmentLeaderId() {
		return departmentLeaderId;
	}
	public void setDepartmentLeaderId(Integer departmentLeaderId) {
		this.departmentLeaderId = departmentLeaderId;
	}
	public String getDepartmentDesc() {
		return departmentDesc;
	}
	public void setDepartmentDesc(String departmentDesc) {
		this.departmentDesc = departmentDesc;
	}
	public String getDepartmentPosition() {
		return departmentPosition;
	}
	public void setDepartmentPosition(String departmentPosition) {
		this.departmentPosition = departmentPosition;
	}
	public Integer getIsEnd() {
		return isEnd;
	}
	public void setIsEnd(Integer isEnd) {
		this.isEnd = isEnd;
	}
	public Integer getIsStart() {
		return isStart;
	}
	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}
	public Integer getTopDepartmentId() {
		return topDepartmentId;
	}
	public void setTopDepartmentId(Integer topDepartmentId) {
		this.topDepartmentId = topDepartmentId;
	}
	public Integer getNextDepartmentId() {
		return nextDepartmentId;
	}
	public void setNextDepartmentId(Integer nextDepartmentId) {
		this.nextDepartmentId = nextDepartmentId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + ", departmentLeaderId=" + departmentLeaderId
				+ ", departmentDesc=" + departmentDesc
				+ ", departmentPosition=" + departmentPosition + ", isEnd="
				+ isEnd + ", isStart=" + isStart + ", topDepartmentId="
				+ topDepartmentId + ", nextDepartmentId=" + nextDepartmentId
				+ ", user=" + user + "]";
	}
	
}
