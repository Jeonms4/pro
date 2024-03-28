package InterfaceEx3;

public class Bus implements Vehicle{
	
	public void run() {
		System.out.println("버스 달림");
	}
	
	void checkFare() {
		System.out.println("승차 요금 체크");
	}
}
