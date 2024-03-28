package ex6;

import java.util.Arrays;

public class Ex20 {
	
	static int[] shuffle(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int randomIdx = (int)(Math.random() * arr.length);
			System.out.println(randomIdx);
			int tmp= arr[i];
			arr[i] = arr[randomIdx];
			arr[randomIdx] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		int result[] = shuffle(original);
	}

}
