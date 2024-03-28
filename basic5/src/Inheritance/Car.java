package Inheritance;

public class Car {
	int speed;
	
	void speedup() {
		speed = 1;
	}
	
	void stop() {
		System.out.println("차 멈춤");
		speed = 0;
	}

}
