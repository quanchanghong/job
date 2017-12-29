package springmvc.qch.pojo;
/**
 * 员工状态表
 * 0，试用期
 * 1，已转正
 * 2，复职
 * -1，离职
 * -2，试用延期
 * @author 1500000367-3
 *
 */
public class UserState {
	
	private Integer userStateId;
	private String userStateName;
	public Integer getUserStateId() {
		return userStateId;
	}
	public void setUserStateId(Integer userStateId) {
		this.userStateId = userStateId;
	}
	public String getUserStateName() {
		return userStateName;
	}
	public void setUserStateName(String userStateName) {
		this.userStateName = userStateName;
	}
	@Override
	public String toString() {
		return "UserState [userStateId=" + userStateId + ", userStateName="
				+ userStateName + "]";
	}
	
}
