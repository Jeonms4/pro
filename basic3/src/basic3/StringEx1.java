package basic3;
import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// 문자열 추출
		String ssn = "9506241230123";
		
		System.out.println(ssn.length());
		
		// camel case
		int ssnlength = ssn.length();
		System.out.println(ssnlength);
		
		System.out.println(ssn.charAt(0));
		System.out.println(ssn.charAt(6));
	}

}
