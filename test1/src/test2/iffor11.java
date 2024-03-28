package test2;

public class iffor11 {

	public static void main(String[] args) {
		if (true) {
			System.out.println("hi");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("hello");
		}
		int su;
		su = 80;
		if (su >= 90) {
			System.out.println("A");
		} else if (su >= 80) {
			System.out.println("B");
		} else if (su >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		switch (3) {
		case 1: {
			System.out.println("1");
			break;
		}
		case 2: {
			System.out.println("2");
			break;
		}
		case 3: {
			System.out.println("3");
			break;
		}
		}
	}

}
