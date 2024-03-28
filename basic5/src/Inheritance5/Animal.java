package Inheritance5;

public abstract class Animal {
	// Animal 부모, Bird/Insect/Fish 자식
	// 메소드(함수)는 두 부분으로 나뉜다.
	
	// 선언부와 구현부
	
	// 선언부 void sound()
	// 구현부 { system.out.println("");
	
	// 구현부가 없는 메소드를 추상(abstract) 메소드라고 한다.
	// 추상 메소드가 없는 클래스는 추상 클래스여야 한다.	
	abstract void sound();
}
