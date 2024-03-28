package Inheritance2;

public class D extends A {
	public D() {
		super();
	}
	
	void method1() {
		//this.field="dhkd";
		System.out.println(this);
		System.out.println(this.field);
		//this.method();
	}
	
	void method2() {
		// new A();
	}
}
