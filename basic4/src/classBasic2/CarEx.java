package classBasic2;

public class CarEx {

	public static void main(String[] args) {
		/*
		 * Car myCar = new Car("제네시스", "검정", 300); System.out.println(myCar.company +
		 * " " + myCar.model + " " + myCar.color + " " + myCar.maxspeed);
		 * System.out.println("============="); Car myCar2 = new Car("검정", "제네시스", 300);
		 * System.out.println(myCar2.company + " " + myCar2.model + " " + myCar2.color +
		 * " " + myCar2.maxspeed);
		 */

		/*Car myCar = new Car();
		System.out.println(myCar.model + " " + myCar.color);
		Car myCar2 = new Car("에쿠스");
		System.out.println(myCar2.model + " " + myCar2.color + " " + myCar2.maxspeed);
		Car myCar3 = new Car("르망", "녹색");
		System.out.println(myCar3.model + " " + myCar3.color + " " + myCar3.maxspeed);*/
		
		Car myCar = new Car();
		
		myCar.roll1();
		myCar.roll2();
		
		int value= myCar.roll2();
		System.out.println(value);
	}

}
