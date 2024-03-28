package control;

public class BreakEx1 {

	public static void main(String[] args) {
		// 반복문에서 사용, 반복하다가 중간에 멈추는 경우에

		for (int i = 0; i < 10; i++) {
			System.out.println("hi");
			if (i == 7) {
				break;
			}
		}
	}

}
