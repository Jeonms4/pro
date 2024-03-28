package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		while (i + j != 5) {
			i=(int)(Math.random()*6) + 1;
			j=(int)(Math.random()*6) + 1;
		}
		System.out.println("(" + i + ", " + j + ")");
	}

}
