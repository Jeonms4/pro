package basic3;
import java.util.Scanner;

public class StringEx1_2 {

	public static void main(String[] args) {
		// 1이나 3이면 남자 2나 4면 여성
		
		Scanner scanner = new Scanner(System.in);
		
		String ss = scanner.nextLine();
		char genderNum = ss.charAt(0);
		System.out.println(genderNum);

		if (genderNum == '1' || genderNum == '3') {
			System.out.println("남성");
		} else if (genderNum == '2' || genderNum == '4') {
			System.out.println("여성");
		}

	}

}
