package basic4;

public class FunEx {
	void method1() {
		System.out.println("m1");
	}
	
	static void smethod1() {
		System.out.println("sm-1");
	}
	
	public static void main(String args[]) {
		FunEx ex1 = new FunEx();
		ex1.method1();
		
		FunEx.smethod1();
	}

}
