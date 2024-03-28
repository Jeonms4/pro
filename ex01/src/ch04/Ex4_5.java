package ch04;

public class Ex4_5 {

	public static void main(String[] args) {
		for(int x= 0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				if((4 * x + 5 * y) == 60) {
					System.out.println("x는 " + x + "이고 y는 " + y + "이다.");
				}
			}
		}
	}

}
