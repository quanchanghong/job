package springmvc.qch.pojo;

/**
 * 专业下的系统
 * @author 1500000478-20
 *
 */
public class MajorSys {
	
	private Integer majorSysId;
	private String majorSysCode;
	private String majorSysName;
	private Integer majorId;
	private Major major;
	
	public String getMajorSysCode() {
		return majorSysCode;
	}
	public void setMajorSysCode(String majorSysCode) {
		this.majorSysCode = majorSysCode;
	}
	public Integer getMajorId() {
		return majorId;
	}
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	public Integer getMajorSysId() {
		return majorSysId;
	}
	public void setMajorSysId(Integer majorSysId) {
		this.majorSysId = majorSysId;
	}
	public String getMajorSysName() {
		return majorSysName;
	}
	public void setMajorSysName(String majorSysName) {
		this.majorSysName = majorSysName;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "MajorSys [majorSysId=" + majorSysId + ", majorSysCode="
				+ majorSysCode + ", majorSysName=" + majorSysName
				+ ", majorId=" + majorId + ", major=" + major + "]";
	}
	
}
