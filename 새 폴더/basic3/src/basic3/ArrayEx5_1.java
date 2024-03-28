package basic3;

public class ArrayEx5_1 {

	public static void main(String[] args) {
		
		
		// 학생 1 국영수 90 90 90
		// 학생 2 국영수 80 80 80
		// 학생 3 국영수 70 70 70
		
		String arr4[]=new String[] {"학생 1", "학생 2", "학생 3"};
		String arr5[]=new String[] {"국어", "영어", "수학"};

		int stu1[]=new int[] {90, 90, 90};
		int stu2[]=new int[] {80, 80, 80};
		int stu3[]=new int[] {70, 70, 70};
		int total1=0;
		int total2=0;
		int total3=0;
		double totalAll=0;
		
		for(int i=0;i<stu1.length;i++) {
			total1+=stu1[i];
			total2+=stu2[i];
			total3+=stu3[i];
		}
		
		double avg1=(double)total1/stu1.length;
		System.out.printf("학생 총점 : %d\t 평균 : %.1f\n",total1, avg1);
		double avg2=(double)total2/stu2.length;
		System.out.printf("총점 : %d\t 평균 : %.1f\n",total2, avg2);
		double avg3=(double)total3/stu3.length;
		System.out.printf("총점 : %d\t 평균 : %.1f\n",total3, avg3);
		
		totalAll=(avg1+avg2+avg3)/3;
		System.out.println("반 평균 : "+totalAll);
	
	}

}
