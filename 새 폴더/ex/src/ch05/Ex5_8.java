package ch05;

public class Ex5_8 {

	public static void main(String[] args) {
	
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int total=0;
		double totalAvg=0;
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				total+=array[i][j];
				count++;
			}
			totalAvg=(double)total/count;
		}
		System.out.println("전체 합 : "+total);
		System.out.println("평균 : "+totalAvg);
	}

}
