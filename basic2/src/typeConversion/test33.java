package typeConversion;

public class test33 {

	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		int z =(++x) + (y--);
		System.out.println(z);
		
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = 534/30;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = 1;
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println(value-56);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop +lengthBottom) * height / 2.0;
		double area2 = (lengthTop +lengthBottom) * height * 1.0 / 2.0;
		double area3 = (double)(lengthTop +lengthBottom) * height / 2.0;
		double area4 = (double)((lengthTop +lengthBottom) * height / 2.0);
		System.out.println(area4);
		
		int i = 10;
		int j = 5;
		
		System.out.println((i>7) && (j<=5));
		System.out.println((i%3 == 2) || (j%2 != 1));
		
		double a = 5.0;
		double b = 0.0;
		double c = 5 % b;
		if(Double.isNaN(c)) {
			System.out.println("0.0으로 나눌수 없습니다.");
		} else {
			double result1 = c + 10;
			System.out.println("결과: " + result1);
		}
	}

}
