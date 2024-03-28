package Inheritance;

public class Computer extends Calculator {
	public Computer() {
		
	}
	
	double areaCircle(double r) {
		System.out.println("자식의 areaCircle");
		double result = Math.PI*r*r;
		return result;
	}
}
