package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		// greaterthan or equal to 0.0 and less than 1.0
		// 0.0<= 나오는 수 <1.0
		// 나오는 수>= 0.0 && 나오는 수<1.0
//		System.out.println(Math.random());
		
		// 주사위 1, 2, 3, 4, 5, 6
		
//		System.out.println((int)Math.random()*10);
//		System.out.println((int)(Math.random()*10));
//		

//			System.out.println((int)(Math.random()*6)+1);
			
		
	
		while(true) {
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			int result=num1+num2;
			if(result==5) {
				System.out.printf("(%d,%d)",num1,num2);
				System.out.print(" ");
				break;
			}
		}	
	}
}
