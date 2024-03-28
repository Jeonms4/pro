package Inheritance;

public class SmartPhone extends Phone {
	
	boolean wifi;
	
	public SmartPhone() {
		// super();
	}
	
	public SmartPhone(String model, String color) {
		super(model, color);
		//this.model = model;
		//this.color = color;
	}
	
	void internet() {
		System.out.println("인터넷 연결");
	}
	
	void setWifi(boolean wifi) {
		this.wifi= wifi;
		System.out.println("와이파이 상태 변경");
	}
}
