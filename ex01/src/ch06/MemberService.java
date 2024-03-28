package ch06;

public class MemberService {
	String id, password;
	private boolean stop;

	public MemberService() {

	}

	boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if (id.equals("hong") && password.equals("12345")) {
			stop = true;
		}
		return stop;
	}

	void logout(String id) {
		if (id.equals(this.id)) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		} else {
			System.out.println("id가 다릅니다.");
		}
	}
}
