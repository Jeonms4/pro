package ch04;

import java.util.Scanner;

public class Ex4_7_2 {

	public static void main(String[] args) {

		
		Scanner scanner= new Scanner(System.in);
//		String inputStr=scanner.nextLine();
//		scanner.equals("q");
//		System.out.println(scanner.equals("q"));
		int total=0;
		
		boolean flag=true;
		int inputNum=0;
		while(flag) {
			System.out.println("--------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("--------------------------");
			
			String inputSrt=scanner.nextLine();
			inputNum=Integer.parseInt(inputSrt);
			
			if(inputNum==1) {
				System.out.print("예금할 금액 :");
				int inputM=Integer.parseInt(scanner.nextLine());
				total+=inputM;
			}else if(inputNum==2) {
				System.out.print("출금할 금액 :");
				int outputM=Integer.parseInt(scanner.nextLine());
				
				if(total>=outputM)
				{
					total-=outputM;
				}else {
					System.out.println("잔고부족.");
				}
			}else if(inputNum==3) {
				System.out.print("잔고 :");
				System.out.println(total);
			}else if(inputNum==4) {
				flag=false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
			
			
		}
		
		
		

	}
}
