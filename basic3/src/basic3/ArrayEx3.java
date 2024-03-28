package basic3;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 국 영 수 85 95 97
		int arr[] = new int[] {85, 95, 97};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============");
		
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i];
		}
		System.out.println(total);
		
		double avg = (double)total / arr.length;
		
		System.out.printf("%f.2", avg);

	}

}
