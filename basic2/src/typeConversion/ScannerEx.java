package typeConversion;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// 입력을 하기 위해서는 Scanner라는 클래스를 이용해야 한다.
		
		// 틀(클래스)에서 객체(Object)를 만드는 행위를 한 후에 거기서 만들어진 그 객체를 가지고 입력해야 한다.
		
		// 만들고 나면 변수에 주소값을 저장하는 행위를 해야 함.
		
		// 만들 때 어떤 인수를 넣어주고 만들어야할 때도 있다.
		
		Scanner scanner = new Scanner(System.in);
		
		//String value = scanner.next();
		//System.out.println(value);
		
		//String value2 = scanner.nextLine();
		//System.out.println(value2);
		
		//int value3 = scanner.nextInt();
		//System.out.println(value3);
		
		String value = scanner.next();
		int num = Integer.parseInt(value);
		System.out.println(value + 1);
		System.out.println(num + 1);
	}
}
