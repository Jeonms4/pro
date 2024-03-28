package ch04;
import java.util.Scanner;

public class Ex4_7_2 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		
		// 계속 돌아야함 while
		// String inputStr=scanner.nextInt();
		// System.out.println(inputStr.equals("q"));
		
		//계좌 잔고 balance
		int balance = 0;
		
		boolean flag=true;
		while(flag) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			// String inputStr = scanner.nextLine();
			int inputStr = scanner.nextInt();
			if (inputStr == 1) {
				int money = scanner.nextInt();
				balance = balance + money;
			} else if(inputStr == 2) {
				int outputmoney =  scanner.nextInt();
				balance = balance + outputmoney;
			} else if (inputStr == 3) {
				System.out.println("잔고 : " + balance);
			} else if (inputStr == 4) {
				flag=false;
			}
		}
	}

}
