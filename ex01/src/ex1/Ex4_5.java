package ex1;

public class Ex4_5 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		int i=1;
		while(i<=10) {
			int j = 1;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
