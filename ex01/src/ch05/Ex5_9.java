package ch05;

import java.util.Scanner;

public class Ex5_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sc = 0;
		while (sc != 4) {
			System.out.println("========================");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("========================");
			System.out.print("선택> ");
			sc = scanner.nextInt();
			int snum=0;
			int scores[];
			if (sc == 1) {
				System.out.print("학생수> ");
				snum = scanner.nextInt();
			} else if (sc == 2) {
				scores = new int[snum];
				for(int i=0; i<snum; i++) {
					System.out.print("Scores[" + i +"]> ");
					scores[i] = scanner.nextInt();
				}
			}
		}
	}

}
