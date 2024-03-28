package basic3;

public class ArrayEx3 {

	public static void main(String[] args) {
		
//		배열은 첫 생성시 배열 항목은 기본값(0)으로 초기화됨
		int arr1[]=new int[3];
		double arr2[]=new double[3];
		char arr3[]=new char[3];
		String arr4[]=new String[3];
		boolean arr5[]=new boolean[3];
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			System.out.println(arr3+"#");
		}
	}

}
