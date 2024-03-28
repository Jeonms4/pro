package ex1;

public class Ex2_9 {

	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;  // X
		ch = (char)b; // X
		short s = (short)ch; // X
		float f1 = (float)l;  // O
		i = ch; // O
		System.out.println(i);
		
		// 0~65535
		
		// byte b = 256;
		// char c ='';
		// char answer = 'no';
		// float f = 3.14;
		double d = 1.4e3f;
		
		// a, b
		
		// b, c

		// 함수명 앞에는 무조건 return 타입(데이터 타입)이 와야함
		// 데이터 타입 기본형 bsil fd cb 참조형 String
		// 비어있는 타입 void
	}

}
