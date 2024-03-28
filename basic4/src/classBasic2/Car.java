package classBasic2;

public class Car {
	// 필드 : 차가 가지고 있는 속성	(공간)
	String company="HD";
	
	String model;
	String color;
	
	int maxspeed;
	
	// 생성자
	public Car() {
		this("아반떼", "파랑", 200);
	}
	
	Car(String model) {
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model, color, 400);
	}
	
	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	// 메소드(함수), 함수는 기능, 기능은 동작, 동사에 해당
	
	// 리턴 타입 메소드명() {}
	
	// 메소드 정의1 void인 경우
	void roll1() {
		System.out.println("차가 달린다.");
	}
	
	// void를 제외한 나머지는 return 함수 안에 넣어놓고 일단 해당 타입의 초기값(0)
	
	// 메소드 정의2 기본 타입(bsil fd cb)인 경우
	int roll2() {
		return 0;
	}
	
	double roll3() {
		return 0.0;
	}
	
	boolean roll4() {
		return false;
	}
	
	// 메소드 정의3 참조형(배열, 열거, 클래스, 인터페이스)
	int[] roll5() {
		return null;
	}
	
	String roll6() {
		return null;
	}
	
	Car roll7() {
		return null;
	}
}
