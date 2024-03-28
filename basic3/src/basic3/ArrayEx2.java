package basic3;

public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[];

		arr = new int[4];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		System.out.println(System.identityHashCode(arr));
		System.out.println("배열의 길이 : " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int arr2[] = new int[4];
		System.out.println(System.identityHashCode(arr2));
		System.out.println("배열의 길이 : " + arr2.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int arr3[] = new int[] {70, 80, 90, 100};
		int arr4[] = new int[] {'c', 'd', 'e', 'f'};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr4[i]);
		}
		
		String arr5[] = new String[] {"짜장", "짬뽕", "볶음밥", "탕수육"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr5[i]);
		}
	}

}
