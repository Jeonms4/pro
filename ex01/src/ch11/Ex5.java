package ch11;

public class Ex5 {

	public static void main(String[] args) {
		// 정답 4번
		Test test = new Test();
		
		try {
			test.method1();
		} catch (NumberFormatException | ClassNotFoundException e) {
			
		}
		
		// 2
		try {
			test.method1();
		} catch (NumberFormatException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
		
		// 3
		try {
			test.method1();
		} catch (Exception e) {
			
		}

	}

}
