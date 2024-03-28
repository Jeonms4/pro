package control2;

public class NestedFor {

	public static void main(String[] args) {
		for(int i =2; i<10; i++) {  // 행
			for(int j =1; j<10; j++) {  // 열
				System.out.print(i + "x" + j + "=" + i * j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
