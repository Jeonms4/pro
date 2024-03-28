package ex8;

import java.util.Scanner;

public class Ex8_8 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요.");
			try {
				input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다." + "다시 값을 입력해주세요.");
				continue; // 반복문안에서 사용시 이번 단계는 종료하고 다음 단계로 넘어가서 다시 실행한다.
			}
			if (answer > input) {
				System.out.println("더 큰 수를 입력해주세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력해주세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는" + count + "번입니다.");
				break; // do-while문을 벗어난다
			}
		} while (true); // 무한 반복문
	}
}
