package basic3;

public class ArrayEx7_2 {

	public static void main(String[] args) {
		
		int score[][]=new int[][] {{70,80,90},{70,80,90},{70,80,90}};
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				if(i==0) {
					System.out.print("학생 1");
					if(j==0) {
						System.out.print("의 국어 성적은 "+score[i][j]+"점\t");
					}else if(j==1) {
						System.out.print("영어 성적은 "+score[i][j]+"점\t");
					}else if(j==2) {
						System.out.println("수학 성적은 "+score[i][j]+"점\t");
					}
				}else if(i==1){
					System.out.print("학생 2");
					if(j==0) {
						System.out.print("의 국어 성적은 "+score[i][j]+"점\t");
					}else if(j==1) {
						System.out.print("영어 성적은 "+score[i][j]+"점\t");
					}else if(j==2) {
						System.out.println("수학 성적은 "+score[i][j]+"점\t");
					}
				}else if(i==2) {
					
					System.out.print("학생 3");
					if(j==0) {
						System.out.print("의 국어 성적은 "+score[i][j]+"점\t");
					}else if(j==1) {
						System.out.print("영어 성적은 "+score[i][j]+"점\t");
					}else if(j==2) {
						System.out.println("수학 성적은 "+score[i][j]+"점\t");
					}
				}
				
			}
		}
	}

}
