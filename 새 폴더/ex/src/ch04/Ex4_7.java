package ch04;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {

		int inputNum = 0;
		long inputLin = 0L;
		long inputLout = 0L;
		long total = 0L;

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("-----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-----------------------------");
				System.out.print("선택> ");
				inputNum = scanner.nextInt();

				switch (inputNum) {
					case 1: {
						System.out.print("예금액>");
						inputLin = scanner.nextInt();
						total += inputLin;
						continue;
					}

					case 2: {
						System.out.print("출금액>");
						inputLout = scanner.nextInt();
						if(total>inputLout) {
							total -= inputLout;
						}else {
							System.out.println("잔고 부족");
						}
						continue;
					}

					case 3: {
						System.out.print("잔고>");
						System.out.println(total);
						continue;
					}

					case 4: {
						System.out.println();
					}
				
					}
					if (inputNum == 4) {
						System.out.println("프로그램 종료");
						break;
					}

				}
			
			}

	}
}
