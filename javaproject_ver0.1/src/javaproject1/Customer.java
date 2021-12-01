package javaproject1;

public class Customer {
	UserInfo ui;
	int age;
	
	public Customer(UserInfo ui, int age) {
		super();
		this.ui = ui;
		this.age = age;
	}
	public Customer() {
		
	}
	
	public Customer(int age,String gender, int onlineTime, String city) {
		super();
		ui = new UserInfo(gender, onlineTime, city);
		this.age = age;
	}

	public UserInfo getUi() {
		return ui;
	}

	public void setUi(UserInfo ui) {
		this.ui = ui;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("age: %d %s \n",age,ui);
	}
}
