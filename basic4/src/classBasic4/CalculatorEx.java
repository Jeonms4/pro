package classBasic4;
import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		//System.out.println(result);
		
		int input = 0;
		while(input == 0) {
			System.out.println("첫번째 수를 입력하세요.");
			int i = scanner.nextInt();
			System.out.println("두번째 수를 입력하세요.");
			int j = scanner.nextInt();
			
			System.out.println("1. 더하기 | 2. 빼기 | 3. 곱하기 | 4. 나누기 | 5. 종료");
			input = scanner.nextInt();
			if(input == 1) {
				int result1 = calculator.add2(i, j);
				System.out.println(result1);
			} else if(input == 2) {
				int result2 = calculator.min(i, j);
				System.out.println(result2);
			} else if(input == 3) {
				int result3 = calculator.mul(i, j);
				System.out.println(result3);
			} else if(input == 4) {
				double result4 = calculator.div(i, j);
				System.out.println(result4);
			} else if(input == 5) {
				System.out.println("종료.");
				break;
			}
		}
	}

}
