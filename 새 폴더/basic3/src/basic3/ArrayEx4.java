package basic3;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		
		String arr1[]=new String[] {"국어", "영어", "수학"};
		int arr2[]=new int[] {81, 91, 84};
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+"=");
			System.out.println(arr2[i]);
		}
		System.out.println("------------------------");
//		평균을 구하는 방법 : 과목의 총합(누적합)과 과목의 수
//		1) 과목의 총합(누척합)과 과목의 수(arr.length)
//		2) (double)총합/ 과목의 수
		System.out.println("세 과목의 평균은"+(arr2[0]+arr2[1]+arr2[2])/3.0);
		int total=0;
		for(int i=0;i<arr2.length;i++) {
			total=total+arr2[i];
		}
		System.out.println(total);
		System.out.println(total/arr2.length);
		
		System.out.println("-------------------------");
		
		double avg = (double) total / arr2.length;
		System.out.printf("%.2f", avg);
	}

}
