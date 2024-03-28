package exam01_1;

public class A {
	
	public A() {
		System.out.println("A 생성자 부분");
	}
	
	void userB() {
		B b = new B();
		System.out.println(b.field1);
	}
	
	class B {
		int field1=1;
		String str="hi";
		
		static int field2=2;
		public B() {
			System.out.println("B 생성자 부분");
		}
		void m1() {
			System.out.println("B-m1");
		}
		
		static void m2() {
			System.out.println("B-m2");
		}
	}
	
	static class BB{
	}
}
