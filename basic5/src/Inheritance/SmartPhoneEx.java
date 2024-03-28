package Inheritance;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		new SmartPhone();
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		//myPhone.model ="G-S24";
		//myPhone.color = "black";
		
		System.out.println(myPhone.model + myPhone.color);
		
		myPhone.bell();
		
		System.out.println(myPhone.wifi);
		myPhone.setWifi(true);
		
		myPhone.internet();
	}

}
