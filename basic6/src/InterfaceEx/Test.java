package InterfaceEx;

public class Test {

	public static void main(String[] args) {
		System.out.println(RemoteControl.MAX_VALUE);
		
		RemoteControl remotecontrol=null;
		System.out.println(remotecontrol);
		
		remotecontrol = new Television();
		System.out.println(remotecontrol);
		remotecontrol.turnOn();
		
		remotecontrol = new Audio();
		System.out.println(remotecontrol);
		remotecontrol.turnOn();
		
		remotecontrol = new Audio();
		remotecontrol.setVolume(100);
		remotecontrol.setVolume(-40);
		remotecontrol.setVolume(8);
		
		remotecontrol = new Television();
		remotecontrol.setVolume(50);
		remotecontrol.setVolume(-5);
		remotecontrol.setVolume(5);
		
		remotecontrol.setMute(true);
		remotecontrol.setMute(false);
		
		RemoteControl.changeBattery();
		
		//remotecontrol.display(5);
		// 강제 형번환을 해서 인터페이스(상위개념)을 구현한 텔레비전의 메소드에 접근 가능
		Television tv = (Television)remotecontrol;
		tv.display(5);
		
	}

}
