package typeConversion;

public class PrimitiveAndStringConversionEx {

	public static void main(String[] args) {
		System.out.println(10 + 1);
		System.out.println("10" + 1);  // 1 => "1" 후 	 "10" + "1" 문자열이 연결되어 "101"
		
		System.out.println(Integer.parseInt("10") + 1);
		
		int num1 = Integer.parseInt("10");
		int result = num1 + 1;
		System.out.println(result);
		
		System.out.println(1.5 + 1.3);
		System.out.println("1.5"+ 1.3);
		
		double result2 = Double.parseDouble("1.5");
		System.out.println(result2 + 1.3);
		
		boolean bool= true;
		System.out.println(bool + "안녕");
		
		boolean bool2 = Boolean.parseBoolean("true");
		
		System.out.println(1+2+3);
		System.out.println(1+2*3);
		
		System.out.println(12 + "8");
		System.out.println(10 + (2+"8"));
		
		// 반대로 문자로 만든 후 연결을 하고 싶은 경우

		int num2 = 10;
		String result3 = String.valueOf(num2);
		
		System.out.println(result3 + 1);
		
	}

}
