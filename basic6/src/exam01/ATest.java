package exam01;

public class ATest {

	public static void main(String[] args) {
		A a =  new A();
		a.new B();
		
		System.out.println(a);
		System.out.println(a.new B());
		
		A.B ab = a.new B();
		
		System.out.println("===========");
		
		A.BB abb = new A.BB();
		System.out.println(abb);
	}

}
