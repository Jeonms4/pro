package Inheritance3;

// public class A{} // 다른 A 클래스가 패키지내에 존재하므로 선언 불가능
class A{
	
}

class B extends A{
		
}

class C extends A {
	
}

class D extends B {
	
}
class E extends B {
	
}

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		//C c1 = e;
		
		//B b2 = e;
		//C c2 = d;
	}

}
