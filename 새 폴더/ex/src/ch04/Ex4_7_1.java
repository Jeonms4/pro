package ch04;

import java.util.Scanner;

public class Ex4_7_1 {

	public static void main(String[] args) {

		
		Scanner scanner= new Scanner(System.in);
//		String inputStr=scanner.nextLine();
//		scanner.equals("q");
//		System.out.println(scanner.equals("q"));
		int total=0;
		boolean flag=true;
		while(flag) {
			System.out.println("--------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("--------------------------");
			int inputInt=scanner.nextInt();
			if(inputInt==1) {
				System.out.print("예금할 금액 :");
				int inputM=scanner.nextInt();
				total+=inputM;
			}else if(inputInt==2) {
				System.out.print("출금할 금액 :");
				int outputM=scanner.nextInt();
				
				if(total>outputM)
				{
					total-=outputM;
				}else {
					System.out.println("잔고부족.");
				}
			}else if(inputInt==3) {
				System.out.print("잔고 :");
				System.out.println(total);
			}else if(inputInt==4) {
				flag=false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
			
			
		}
		
		
		

	}
}
