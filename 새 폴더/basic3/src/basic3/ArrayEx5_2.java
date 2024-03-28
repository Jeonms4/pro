package basic3;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		String arr4[]=new String[] {"학생 1", "학생 2", "학생 3"};
		String arr5[]=new String[] {"국어", "영어", "수학"};
		int arr2d[][]=new int[][] {{90, 90, 90},{80, 80},{70, 70, 70}};
//		int stu1[]=new int[] {90, 90, 90};
//		int stu2[]=new int[] {80, 80, 80};
//		int stu3[]=new int[] {70, 70, 70};
		int total[]=new int[3];
		int total1=0;
		int total2=0;
		int total3=0;
		int totalAll=0;
		int stuTotal=0;
		double classAvg=0;
		for(int i=0;i<arr2d.length;i++) {
		
			for(int j=0;j<arr2d[i].length;j++) {
//				System.out.printf("%d %d", i,j);
//				System.out.printf("%d ", arr2d[i][j]);
				stuTotal+=arr2d[i][j];
				classAvg+=(double)arr2d[i][j]/(arr2d.length*arr2d.length);
			}
//			System.out.println();
			double stuAvg=(double)stuTotal/arr2d[i].length;
//			System.out.println("학생별 총합 : "+ stuTotal);
			System.out.printf("학생별 총합 : %d, 학생별 평균 : %.2f\n",stuTotal, stuAvg);
			
		}
		
		System.out.printf("반 평균 : %.2f\n",classAvg);


	}

}
