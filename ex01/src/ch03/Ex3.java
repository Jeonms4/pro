package ch03;

public class Ex3 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = 534/30;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
