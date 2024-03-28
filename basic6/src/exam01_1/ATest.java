package exam01_1;

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		A.B ab = a.new B();
		
		System.out.println(ab.field1);
		System.out.println(ab.str);
		
		ab.m1();
		ab.m2();
		
		a.userB();
	}

}
