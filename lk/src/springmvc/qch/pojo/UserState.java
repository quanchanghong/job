package springmvc.qch.pojo;
/**
 * Ա��״̬��
 * 0��������
 * 1����ת��
 * 2����ְ
 * -1����ְ
 * -2����������
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
