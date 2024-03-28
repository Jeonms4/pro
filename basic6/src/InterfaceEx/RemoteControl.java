package InterfaceEx;

public interface RemoteControl {
	// 상수
	static final int MAX_VALUE=10;
	static final int MIN_VALUE=0;

	// 추
	abstract void turnOn();
	abstract void turnOff();
	
	abstract void setVolume(int volume);
	// 디폴트
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VALUE);
		} else {
			System.out.println("무음 해제");
		}
	}

	// 정적메소드
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
