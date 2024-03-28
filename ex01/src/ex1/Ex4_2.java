package ex1;

public class Ex4_2 {

	public static void main(String[] args) {
		int sum;
		int total = 0;
		for(int i =1; i<11; i++) {
			sum = 0;
			for(int j = 1; j<=i; j++) {
				sum = sum + j;
			}
			total = total + sum;
			System.out.println(sum);
		}
		System.out.println(total);
	}
}
