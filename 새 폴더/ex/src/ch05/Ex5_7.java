package ch05;

public class Ex5_7 {

	public static void main(String[] args) {
	
		int[] array= {1, 5, 3, 8, 2};
		
		int max=0;
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				max=array[i];
			}else {
				max=array[i+1]; 
			}
//			System.out.println(max);
		}
		System.out.println(max);
	}

}
