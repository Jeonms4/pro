package basic3;

public class ArrayEx5_4 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		
//		int arr2d[][]=new int[][] {{90, 90, 90},{80, 60, 30},{70, 40, 50}};
		int arr2d[][]=new int[][] {{90, 90, 90},{80, 60},{70, 40, 50}};
		int subTotal =0;
		
		System.out.print("첫 번째 과목 : ");
		int sub1Total=0;
		for(int i=0;i<arr2d.length;i++) {
			System.out.print(arr2d[i][0]+ " ");
			sub1Total+=arr2d[i][0];
		}
		System.out.println();
		double sub1Avg=(double)sub1Total/arr2d[0].length;
		System.out.printf("총점 : %d\t평균 : %.2f\n",sub1Total,sub1Avg);
		
		//전체 평균 (전체의 갯수 : 행*열)
		
		int total=0;
		int cnt=0;
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				total+=arr2d[i][j];
				cnt++;
			}
		}
	
		System.out.println("count num : "+cnt);
//		double totalAvg=(double)total/(arr2d.length*arr2d[0].length);
		double totalAvg=(double)total/cnt;
		System.out.println(totalAvg);
		


	}

}
