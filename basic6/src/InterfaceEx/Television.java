package InterfaceEx;

public class Television implements RemoteControl {

	private int volume;

	public void turnOn() {
		System.out.println("TV 켬");
	}

	public void turnOff() {

	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨은 " + this.volume);
	}
	
	private int memoryVolume;
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("무음 처리");
			setVolume(MIN_VALUE);
		} else {
			System.out.println("무음 해제");
			setVolume(this.memoryVolume);
		}
	}
	
	void display(int reso) {
		System.out.println("해상도 :" + reso);
	}
}
