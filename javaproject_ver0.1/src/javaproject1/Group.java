package javaproject1;

public class Group { // 그룹의 분류기준 설정
	private UserInfo ui;
	private int minAge;
	private int maxAge;
	public Group() {
		
	}
	
	public Group(int minAge, int maxAge,String gender, int onlineTime, String city) {
		super();
		ui = new UserInfo(gender, onlineTime, city);
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	public UserInfo getUi() {
		return ui;
	}	
	public void setUi(UserInfo ui) {
		this.ui = ui;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		if(minAge > 0) {
			this.minAge = minAge;
		}
		else {
			System.out.println("최소나이 값을 잘못입력하셨습니다");
		}
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		if(maxAge > 0) {
			this.maxAge = maxAge;
		}
		else {
			System.out.println("최대나이 값을 잘못입력하셨습니다");
		}
	}
	public String toString() {
		return String.format("minAge: %d  maxAge: %d %s",minAge,maxAge,ui);
	}
}
