	package Inheritance3;

public class ChildTest2 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		
		System.out.println(parent);
		
		//Child child = (Child)parent;
		
		Child child = null;
		System.out.println(child);
		
		//child = (Child)parent;
		//System.out.println(child);
		
		Child child2 = new Child();
		System.out.println(child2);
		Parent parent2 = null;
		parent2 = child2;
		System.out.println(parent2);
		
		// 강제 형 변환
		// 자식 타입 변수 = (자식 타입)부모 타입 객체;
		Child child3 = (Child)parent2;
		System.out.println(child3);
		child3.method3();

	}

}
