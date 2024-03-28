package basic3;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		String arr4[]=new String[] {"학생 1", "학생 2", "학생 3"};
		String arr5[]=new String[] {"국어", "영어", "수학"};
		int arr3[][]=new int[][] {{90, 90, 90},{80, 80, 80},{70, 70, 70}};
//		int stu1[]=new int[] {90, 90, 90};
//		int stu2[]=new int[] {80, 80, 80};
//		int stu3[]=new int[] {70, 70, 70};
		int total1=0;
		int total2=0;
		int total3=0;
		int totalAll=0;
		
//		for(int i=0; i<3;i++) {
//			for(int j=0;j<3;j++) {
//				if(j<2) {
//					System.out.print("("+i+","+j+")");
//				}else {
//					System.out.print("("+i+","+j+")");
//					System.out.println();
//				}
//				
//				
//			}
//		}
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
					System.out.printf("( %d , %d )\t",i,j);
				}
				System.out.println();
				
			}
		
		int arr2D[][]=new int[3][3];
		
		System.out.println("행의 길이 :"+ arr2D.length);
		System.out.println(arr2D[0]);
		System.out.println(arr2D[0].length);
		System.out.println("1행의 길이(1행의 열의 길이)"+arr2D[0].length);
		System.out.println("1행의 길이(1행의 열의 길이)"+arr2D[1].length);
		System.out.println("1행의 길이(1행의 열의 길이)"+arr2D[2].length);
		
		arr2D[0][0]=90;
		arr2D[0][1]=90;
		arr2D[0][2]=90;
		
		arr2D[1][0]=80;
		arr2D[1][1]=80;
		arr2D[1][2]=80;
		
		arr2D[2][0]=70;
		arr2D[2][1]=70;
		arr2D[2][2]=70;
		
		for(int i=0; i<arr2D.length;i++) {
			for(int j=0;j<arr2D[i].length;j++) {
					System.out.printf("%d\t",arr2D[i][j]);
				}
				System.out.println();
				
			}
		
	}

}
