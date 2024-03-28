package basic3;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		//배열타입 선언(그 배열에 들어갈 타입(int)을 앞에 사용)
		
		int arr1[];
		
		// 그 배열에 방이 몇 개인지 정의
		
		arr1=new int[4];
		
		arr1[0]=7;
		arr1[1]=8;
		arr1[2]=9;
		arr1[3]=10;
//		arr1[3]="hi";와 같이 int형과 String형 처럼 동일하지 않은 타입이 입력이 되면 오류가 발생
		System.out.println(System.identityHashCode(arr1));
		System.out.println("---------------------------");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
//		System.out.println(arr1.length);
		System.out.println("---------------------------");
		int arr2[]=new int[4];
		
		arr2[0]=70;
		arr2[1]=80;
		arr2[2]=90;
		arr2[3]=100;
		System.out.println(System.identityHashCode(arr2));
		System.out.println("---------------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("---------------------------");
	}

}
