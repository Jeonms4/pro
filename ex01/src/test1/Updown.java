package test1;

import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = (int) (Math.random() * 100) + 1;
		int s = 0;
		int count = 0;

		while (!(i==s)) {
			System.out.println("1과 100사이의 값을 입력하세요.");
			s = sc.nextInt();
			count++;
			if(i > s) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(i < s) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (i == s) {
				System.out.println("맞추셨습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
			}
		}
	}

}
