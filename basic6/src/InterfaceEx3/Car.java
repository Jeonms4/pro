package InterfaceEx3;

public class Car {
	
	Tire tire1 = new HTire();
	Tire tire2 = new KTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
