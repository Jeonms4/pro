package typeConversion;

public class PrintEx {

	public static void main(String[] args) {
		System.out.printf("이것은 %d\n", 1);  // digit 숫자(정수)
		System.out.printf("이것은 %c\n", 'a');  // char
		System.out.printf("이것은 %s\n", "hihi");  // string
		
		System.out.printf("이것은 %f\n", 3.14);  // floating point number
		
		System.out.printf("이것은 %d 저것은 %s \n", 3, "nice");
		
		System.out.printf("이것은 %.2f", 3.56789);
		System.out.printf("이것은 %010.2f", 3.56389);

	}

}
