package basic3;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		String arr4[]=new String[] {"학생 1", "학생 2", "학생 3"};
		String arr5[]=new String[] {"국어", "영어", "수학"};
		int arr3[][]=new int[][] {{98, 95, 92},{83, 81, 79},{73, 72, 71}};
//		int stu1[]=new int[] {90, 90, 90};
//		int stu2[]=new int[] {80, 80, 80};
//		int stu3[]=new int[] {70, 70, 70};
		int total[]=new int[3];
		int total1=0;
		int total2=0;
		int total3=0;
		int totalAll=0;
		
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr5.length;j++) {
				System.out.print(arr4[i]+"의 ");
				System.out.print(arr5[j]+" 성적 =");
				System.out.println(arr3[i][j]);
			
//				totalAll+=arr3[i][j];
				if(i==0) {
					total[i]+=arr3[i][j];
				}else if(i==1) {
					total[i]+=arr3[i][j];
				}else {
					total[i]+=arr3[i][j];
				}
			}
			
			System.out.println(total[i]);
			totalAll+=total[i];
		}
		System.out.println(totalAll);
		
		for(int i=0;i<arr4.length;i++) {
			System.out.println("학생"+(i+1)+"의 평균은 "+total[i]/arr3.length);
		}
		
		System.out.println("반의 평균은 "+(double)totalAll/(arr3.length*arr3.length));
		
	
	}

}
