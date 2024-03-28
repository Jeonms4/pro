package InterfaceEx2;

public class SmartTelevision extends Television implements RemoteControl, Searchable{
	public void turnOn() {
		System.out.println("스마트 TV 켬");
	}
	
	public void turnOff() {
		System.out.println("스마트 TV 끔");
	}
	
	public void search(String url) {
		System.out.println(url + "검색");
	}
}
