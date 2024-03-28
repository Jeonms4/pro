package ch04;

public class Ex4_4_1 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		System.out.println(Math.random()*6);
		System.out.println((int)(Math.random()*6));
		System.out.println((int)(Math.random()*6)+1);
		for(int i=0;i<1000;i++) {
			System.out.println((int)(Math.random()*6)+1);
		}
	}
}

