package ex1;

public class Ex4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (sum < 100) {
			if( i%2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			System.out.println(i);
			System.out.println(sum);
			i++;
		}
		System.out.println(sum);
	}

}
