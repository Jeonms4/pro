package ex1;

public class Ex4_11 {

	public static void main(String[] args) {
		int fi1=1;
		int fi2=1;
		int fi3=0;
		
		System.out.println(fi1);
		System.out.println(fi2);
		
		for(int i=1; i<=8; i++) {
			fi3 = fi1 + fi2;
			fi1 = fi2;
			fi2 = fi3;
			System.out.println(fi3);
		}
	}

}
