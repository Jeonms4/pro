package basic3;

public class NullPointerEx {

	public static void main(String[] args) {

		// 참조 : 배열, 열거, 클래스, 인터페이스
		
//		int arr1[]=null;
		
		int num1=10;
		System.out.println(num1);
		int arr1[]=new int[] {7,8,9,10};
		System.out.println(arr1);
		System.out.println(arr1[0]);
		arr1[0]=5;
		System.out.println(arr1[0]);
		
//		System.out.println(arr1[4]);
		
		String str=null;
//		String hi=new String("hi");
		String hi=new String();
		System.out.println(hi+"#");
		
		System.out.println(str.length());
		
//		String arr2[]=new String[] {"가", "나", "다", "라"};
	}

}
