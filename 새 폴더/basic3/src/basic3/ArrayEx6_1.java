package basic3;

public class ArrayEx6_1 {

	public static void main(String[] args) {
		
		int arr2D[][]=new int[3][3];
		
		arr2D[0][0]=90;
		arr2D[0][1]=90;
		arr2D[0][2]=90;
		
		arr2D[1][0]=80;
		arr2D[1][1]=80;
		arr2D[1][2]=80;
								
		arr2D[2][0]=70;
		arr2D[2][1]=70;
		arr2D[2][2]=70;
		
		for(int i=0;i<arr2D.length;i++) {
			for(int j=0;j<arr2D[i].length;j++) {
				System.out.printf("%d\t",arr2D[i][j]);
			}
			System.out.println();
		}
		
	}

}
