package basic3;

public class ArrayEx1_1 {

	public static void main(String[] args) {
		
		int arr1[];
		arr1=new int[4];
		
		arr1[0]=7;
		arr1[1]=8;
		arr1[2]=9;
		arr1[3]=10;
		System.out.println(System.identityHashCode(arr1));
		System.out.println("배열의 길이:"+arr1.length);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		int arr2[]=new int[] {70,80,90,100};
		char arr3[]= new char[] {'가', '나', '다', '라'};
		String arr4[]= new String[] {"짜장", "짬뽕", "볶음밥", "탕수육"};
		System.out.println("--------------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
	}

}
