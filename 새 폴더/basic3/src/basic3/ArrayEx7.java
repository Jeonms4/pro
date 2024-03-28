package basic3;

public class ArrayEx7 {

	public static void main(String[] args) {
		
//		int arr2D[][]=new int[][] {{90, 90, 90}, {80, 80, 80}, {70, 70, 70}};
//		int arr2D[][]=new int[3][];
		//2차원 배열 선언과 값의 할당을 동시에 하는 방법
		int arr2D[][]=new int[][] {
										{90, 90, 90},
										{80, 80, 80, 80},
										{70}
								   };
		
		System.out.println("행의 길이 :"+ arr2D.length);
		System.out.println(arr2D[0]);
		System.out.println(arr2D[0].length);
		System.out.println("1행의 길이(1행의 열의 길이) : "+arr2D[0].length);
		System.out.println("1행의 길이(1행의 열의 길이) : "+arr2D[1].length);
		System.out.println("1행의 길이(1행의 열의 길이) : "+arr2D[2].length);
		
//		arr2D[0][0]=90;
//		arr2D[0][1]=90;
//		arr2D[0][2]=90;
//		
//		arr2D[1][0]=80;
//		arr2D[1][1]=80;
//		arr2D[1][2]=80;
//								
//		arr2D[2][0]=70;
//		arr2D[2][1]=70;
//		arr2D[2][2]=70;
		
		for(int i=0;i<arr2D.length;i++) {
			for(int j=0;j<arr2D[i].length;j++) {
				System.out.printf("%d\t",arr2D[i][j]);
			}
			System.out.println();
		}
		
	}

}
