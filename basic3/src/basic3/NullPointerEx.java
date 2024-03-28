package basic3;

public class NullPointerEx {

	public static void main(String[] args) {
		// 참조형 : 배열, 열거, 클래스, 인터페이스
		
		// int arr[] = null;
		//System.out.println(arr);
		//arr[0] = 5;
		//System.out.println(arr[0]);
		
		int num1 = 10;
		System.out.println(num1);
		
		int arr[] = new int[] {7,8,9,10};
		System.out.println(arr);
		
		System.out.println(arr[0]);
		arr[0]=3;
		System.out.println(arr[0]);
		// System.out.println(arr[4]);
		
		String str1 = "hi";
		String hi = new String("hi");
		String str2 = null;
		System.out.println(str2);
		
		String hi2 = new String();
		System.out.println(hi2 + "a");
		
		String str3 = null;
		System.out.println(str3);
		// System.out.println(str3.length);
	}

}
