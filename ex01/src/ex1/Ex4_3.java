package ex1;

public class Ex4_3 {

	public static void main(String[] args) {
		int tot=0;
		for(int i =0; i<=20; i++) {
			if(!((i%2 == 0) || (i % 3 == 0))) {
				tot += i;
			}
		}
		
		System.out.println(tot);

	}

}
