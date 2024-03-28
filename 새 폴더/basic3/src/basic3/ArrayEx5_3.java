package basic3;

public class ArrayEx5_3 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		String arr4[]=new String[] {"학생 1", "학생 2", "학생 3"};
		String arr5[]=new String[] {"국어", "영어", "수학"};
		int arr2d[][]=new int[][] {{90, 90, 90},{80, 60, 30},{70, 40, 50}};
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
		int kor=0;
		int eng=0;
		int math=0;
		
		
		for(int i=0;i<arr2d.length;i++) {
						
			for(int j=0;j<arr2d[i].length;j++) {
				stuTotal+=arr2d[i][j];
				classAvg+=(double)arr2d[i][j]/(arr2d.length*arr2d.length);
				if(j==0){
					kor+=arr2d[i][j];
				}else if(j==1) {
					eng+=arr2d[i][j];
				}else {
					math+=arr2d[i][j];
				}
			}
//			System.out.println();
			double stuAvg=(double)stuTotal/arr2d[i].length;
//			System.out.println("학생별 총합 : "+ stuTotal);
			System.out.printf("학생별 총합 : %d, 학생별 평균 : %.2f\n",stuTotal, stuAvg);
			
		}
		int arr6[]=new int[] {kor, eng, math};
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]+"의 평균"+arr6[i]/arr5.length);
		}
		System.out.printf("반 평균 : %.2f\n",classAvg);


	}

}
