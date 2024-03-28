package Inheritance;

public class Calculator {
	
	public Calculator() {
		
	}
	
	double areaCircle(double r) {
		System.out.println("부모의 areaCircle");
		double result = 3.14159*r*r;
		return result;
	}
}
