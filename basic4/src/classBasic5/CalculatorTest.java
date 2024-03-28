package classBasic5;

public class CalculatorTest {
	public CalculatorTest() {
		
	}

	public static void main(String[] args) {
		method();
	}
	
	static void method() {
		Calculator calc = new Calculator();
		calc.powerOn();
		int result = calc.plus(1, 5);
		System.out.println(result);
		
		double result2 = calc.divide(15, 3);
		System.out.println(result2);
		
		int result3 = calc.mul(5, 4);
		System.out.println(result3);
	}

}
