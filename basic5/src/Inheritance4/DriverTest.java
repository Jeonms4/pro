package Inheritance4;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		
		// 자동 형 변환
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
