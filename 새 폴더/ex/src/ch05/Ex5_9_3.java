package ch05;

import java.util.Scanner;

// switch 방식
public class Ex5_9_3 {

	public static void main(String[] args) {
		boolean flag = true;
		int inputStuNum = 0;
		int score[] = {};
		int max = 0;
		int total = 0;
		int avg = 0;

		Scanner scanner = new Scanner(System.in);

		while (flag) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1 -> {
				System.out.print("학생수> ");
				inputStuNum = scanner.nextInt();
				score = new int[inputStuNum];
			}
			case 2 -> {
				if(inputStuNum==0) {
					System.out.println("학생수를 입력하지 않았습니다.");
				}
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d]: ", i);
					score[i] = scanner.nextInt();
					total += score[i];
				}

			}
			case 3 -> {
				if(inputStuNum==0) {
					System.out.println("입력된 점수가 없습니다.");
				}
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d]: ", i);
					System.out.println(score[i]);
				}

			}
			case 4 -> {
				if(inputStuNum==0) {
					System.out.println("최고, 평균 점수를 구할 수 없습니다.");
				}else {
					for (int i = 0; i < score.length; i++) {
						if (score[i] > max) {
							max = score[i];
						}
						avg = total / score.length;
					}
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + avg);
				}
			}
			case 5 -> {
				flag = false;
				System.out.println("프로그램 종료");
			}
			}
		System.gc();
		}

	}

}
