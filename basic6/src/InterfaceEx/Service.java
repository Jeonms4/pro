package InterfaceEx;

public interface Service {
	// 상수
	
	// 추상 메소드
	
	
	// 디폴트 메소드
	default void defaultMethod1() {
		System.out.println("default1 종속 코드");
		
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("default2 종속 코드");
		
		defaultCommon();
	}
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	// 정적 메소드
	
	
	static void staticMethod1() {
		System.out.println("staticMethod 종속 코드A");
		staticMethod2();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod 종속 코드B");
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드 C");
		System.out.println("staticMethod 중복코드 D");
	}
}
