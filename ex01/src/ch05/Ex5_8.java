package ch05;

public class Ex5_8 {

	public static void main(String[] args) {
		int total = 0;
		double avg;
		int cnt = 0;
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				total = total + array[i][j];
				cnt++;
			}
		}
		avg = (double)total / cnt;
		System.out.printf("%d %.2f", total , avg);
	}

}
