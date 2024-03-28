package test2;

public class Basic1 {

	public static void main(String args[]) {
		// System.out.print("hi");
		// 1이라는 값(숫자, data)을 어딘가(위치)에 방(변수)에 다가 넣어놔야함
		// = 어딘가의 변수명(방이름)에 값을 할당하다.(assignment)
		// 방이름을 지을 때 숫자는 num, 문자는 ch, 문자명은 str, 소문자로 짓는다.
		// 자바에서는 무조건 변수명 앞에 데이터(자료) type(모양, 형)을 넣어야한다.
		// 숫자 중에서 정수(integer) int
		// main 함수 영역을 지역(local)이라 하고, 그 지역 안에 있는 변수를 지역변수(local variable)라고 한다.
		// 지역 변수를 반드시 초기화해야 한다.
		int num1 = 1;
		System.out.println(System.identityHashCode(num1));
		// System.out.println(num1);
	}
}
