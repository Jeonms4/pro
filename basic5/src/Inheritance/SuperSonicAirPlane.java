package Inheritance;

public class SuperSonicAirPlane extends Airplane {
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	// final 클래스는 자식을 만들 수 없다. 재정의 불가능.
	int flymode = NORMAL;
	
	void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();
		}
	}
}
