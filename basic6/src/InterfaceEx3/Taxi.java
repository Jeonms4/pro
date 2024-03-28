package InterfaceEx3;

public class Taxi implements Vehicle{
	public void run() {
		System.out.println("택시 달림");
	}
	
	void checkFare() {
		System.out.println("승차 요금 체크");
	}
}
