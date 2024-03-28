package Inheritance3;

public class Test {

	public static void main(String[] args) {
		Cat cat =new Cat();
		System.out.println(cat);
		
		Animal animal = cat; // 자동형변환
		System.out.println(animal);

	}

}
