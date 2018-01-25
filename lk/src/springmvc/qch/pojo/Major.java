package springmvc.qch.pojo;

import java.io.Serializable;

public class Major implements Serializable{

	private static final long serialVersionUID = -7684260622739037649L;
	
	private Integer majorId;
	private String majorCode;
	private String majorName;
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
