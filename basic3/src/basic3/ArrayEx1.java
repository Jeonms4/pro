package basic3;

public class ArrayEx1 {

	public static void main(String[] args) {
		int arr[];
		
		// 그 배열에 방이 몇 개 인지 정의
		arr = new int[4];
		
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 10;
		System.out.println(System.identityHashCode(arr));
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("============================");
		
		// 한꺼번에 하는 방법
		int arr2[] = new int[4];
		arr2[0] = 70;
		arr2[1] = 80;
		arr2[2] = 90;
		arr2[3] = 100;
		System.out.println(System.identityHashCode(arr2));
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
