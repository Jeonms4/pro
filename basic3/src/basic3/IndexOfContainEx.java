package basic3;

public class IndexOfContainEx {

	public static void main(String[] args) {
		String subject = "자바 파이썬 프로그래밍 자라 파이썬";
		
		// 문자를 찾을 수도 있고, 문자열을 찾을 수도 있다.
		// 찾았을 경우 그 위치(index)가 나옴
		
		int location= subject.indexOf("자", 1);
		System.out.println(location);
		
		int location2= subject.indexOf("프로그래밍");
		System.out.println(location2);
		
		// 찾고자하는 문자, 문자열이 없는 경우 -1이 반환됨.
		// int location3= subject.indexOf("가");
		int location3= subject.indexOf("파이썬", 10);
		System.out.println(location3);
		
		
		int location4= subject.indexOf("자바 스크립트");
		System.out.println(location4);
		
		if(location4 == -1) {
			System.out.println("없다.");
		}
		
		System.out.println("============");
		
		String[] strarr = subject.split(" ");
		System.out.println(strarr);
		
		for(int i=0; i<strarr.length; i++) {
			System.out.println(strarr[i]);
		}
	}

}
