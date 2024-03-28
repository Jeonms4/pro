package ex1;

public class Ex3_1 {

	public static void main(String[] args) {
		// 3-1
		int x = 2;
		int y = 5;
		char c = 'A';  //'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		// 3-2
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples / sizeOfBucket + 1;
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		// 3-3
		System.out.println(true ? "참" : "거짓");
		int num = 10;
		System.out.println();
		
		// 3-4
		num = 456;
		System.out.println(num % 100);
		
		// 3-5
		num = 333;
		System.out.println(num - num % 10 +1);
		
		// 3-6
		num = 24;
		System.out.println((num / 10 +1) * 10 - num);
		
		// 3-7
		int fahrenheit = 100;
		float celsius = 5 / 9f * (fahrenheit -32);
		
		System.out.println(fahrenheit);
		System.out.println(celsius);
	}

}
