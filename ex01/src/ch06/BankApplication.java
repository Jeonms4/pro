package ch06;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		boolean flag=true;
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(flag) {
			System.out.println("=================");
			System.out.println("1.계좌 생성 2.계좌목록 3.예금 4. 출금 5. 종료");
			System.out.println("=================");
			System.out.println("선택>");
			menu = scanner.nextInt();
			if(menu == 1) {
				System.out.println("=================");
				System.out.println("계좌생성");
				System.out.println("=================");
				System.out.print("계좌번호");
				String tempAccNo = scanner.nextLine();
				System.out.print("계좌주");
				String tempAccName = scanner.nextLine();
				System.out.print("초기 입금액");
				int tempBalanace = scanner.nextInt();
				Account2 account = new Account2(tempAccNo, tempAccName, tempBalanace);
				System.out.println("계좌번호" + account.getAccNo() + "계좌주" + account.getAccName() + "초기값");
			}
			
		}

	}

}
