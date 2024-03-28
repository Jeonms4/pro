	package InterfaceEx2;

public class SmartTelevisonTest {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("http://www.naver.com");
	}

}
