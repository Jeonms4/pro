package test2;

import java.util.Scanner;

public class whileEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputstring;
		
		do {
			System.out.println("입력");
			inputstring = scanner.nextLine();
			System.out.println(inputstring);
		} while(!inputstring.equals("q"));
		System.out.println("종료");
	}

}
