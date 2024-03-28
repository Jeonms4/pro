package basic3;

public class ArrayEx5_2_2 {

	public static void main(String[] args) {
		int arr2d[][] = new int[][] { { 90, 90, 90 }, { 80, 80, 80 }, { 70, 70, 70 } };
		int subjectScores[] = new int[3];
		for(int i = 0; i<arr2d.length; i++) {
			for(int j=0; j < arr2d.length; j++) {
				subjectScores[j] += arr2d[i][j];
			}
		}
		
	}

}
