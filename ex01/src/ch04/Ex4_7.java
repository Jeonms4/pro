package ch04;
import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i= 0;
		int j = 0;
		int save = 0;
		while (i != 4) {
			System.out.println("------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			i = scanner.nextInt();
			
			if (i == 1) {
				System.out.print("예금액");
				j = scanner.nextInt();
				save += j;
			} else if (i == 2) {
				System.out.print("출금액");
				j = scanner.nextInt();
				save -= j;
			} else if (i == 3) {
				System.out.print("잔고");
				System.out.println(save);
			} else if (i == 4) {
				System.out.print("종료");
			} else {System.out.println("오류");}
		}
	}
}
