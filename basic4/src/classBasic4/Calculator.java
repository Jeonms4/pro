package classBasic4;

public class Calculator {
	
	public Calculator() {
		
	}
	
	void add(int num1, int num2) {
		int result = num1+ num2;
		System.out.println(result);
	}
	
	int add2(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	int min(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	double div(int num1, int num2) {
		double result = num1 / num2;
		return result;
	}
	
	
}
