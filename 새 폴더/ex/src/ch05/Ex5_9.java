package ch05;

import java.util.Scanner;

public class Ex5_9 {

	public static void main(String[] args) {

		boolean flag = true;
		int inputStuNum = 0;
		int inputnum = 0;
		int score[] = new int[8];
		long max=0L;
		long total=0L;
		long avg=0L;
		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			String input = scanner.nextLine();
			inputnum = Integer.parseInt(input);
			if (inputnum == 1) {
				System.out.print("학생수> ");
				inputStuNum = Integer.parseInt(scanner.nextLine());
			} else if (inputnum == 2) {
				for (int i = 0; i < inputStuNum; i++) {
					System.out.printf("score[%d]: ", i);
					score[i] = Integer.parseInt(scanner.nextLine());
					total+=score[i];
				}	
			} else if (inputnum == 3) {
				for(int i=0;i<inputStuNum;i++) {
					System.out.printf("score[%d]: ",i);
					System.out.println(score[i]);
				}
			} else if (inputnum== 4) {
				
//				for(int i=0;i<inputStuNum;i++) {
//					System.out.print( score[i] + " ");
//					
//					if(max<score[i]) {
//						max = score[i];
//					}
//					System.out.println(max);
//					
//				}
				
				for(int i=0;i<inputStuNum;i++) {
					
					
					if(score[i]>max) {
						max=score[i];
					}
				}
					avg=total/inputStuNum;
					System.out.println("최고 점수: "+max);
					System.out.println("평균 점수: "+avg);
					total=0;

			} else if (inputnum == 5) {
				flag=false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.gc();
		}
	}

}
