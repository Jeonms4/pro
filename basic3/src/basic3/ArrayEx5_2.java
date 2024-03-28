package basic3;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 90, 90, 90 }, { 80, 80, 80 }, { 70, 70, 70 } };

		for (int i = 0; i < arr.length; i++) {

			int stuTotal = 0;
			for (int j = 0; j < arr.length; j++) {
				// System.out.printf("%d %d ", i, j);
				// System.out.printf("%d ", arr[i][j]);
				stuTotal = stuTotal + arr[i][j];
			}
			
			double stuAvg = (double)stuTotal / arr[i].length;
			System.out.println("학생별 총합 : " + stuTotal);
			System.out.printf("학생별 총합 : %d, 학생별 평균 : %.2f \n" , stuTotal, stuAvg);
		}
		
		// 과목별 평균 (과목별 총합, 학생의 수)
		int subTotal = 0;
		int arr2D[][] = new int[][] { { 90, 90, 90 }, { 80, 80, 80 }, { 70, 70, 70 } };
		
		System.out.println("첫번째 과목 : ");
		int sub1Total = 0;
		for(int i =0; i<arr2D.length;i++) {
			System.out.print(arr2D[i][0] + " ");
			sub1Total = sub1Total + arr2D[i][0];
		}
		double sub1Avg = (double)sub1Total /arr2D[0].length;
		System.out.printf("총점 : %d  평균 : %.2f \n",sub1Total, sub1Avg);
		
		//전체 평균
		//System.out.println("갯수 :" + cnt);
		//double totalAvg = (double)total / (arr2D.length * arr2D[0].length);
		//double totalAvg = (double)total / cnt;
		//System.out.println("총점 %d  평균 : %2.f", total, totalAvg);
	}

}
