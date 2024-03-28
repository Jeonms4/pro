package classBasic5;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("내 차의 현재 속력은 " + myCar.speed);
		myCar.speed = 0;
		
		System.out.println("내 차의 현재 속력은 " + myCar.speed);
		
		myCar.changeSpeed();
		
		System.out.println("내 차의 현재 속력은 " + myCar.speed);
	}

}
