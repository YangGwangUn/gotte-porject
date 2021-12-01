package javaproject1;

public class UserInfo {
	private String gender;
	private int onlineTime;
	private String city;
	
	public UserInfo() {
		
	}
	public UserInfo(String gender, int onlineTime, String city) {
		this.gender = gender;
		this.onlineTime = onlineTime;
		this.city = city;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getOnlineTime() {
		return onlineTime;
	}
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return String.format("gender: %s onlineTime: %d city: %s",gender,onlineTime,city);
	}
	
}
