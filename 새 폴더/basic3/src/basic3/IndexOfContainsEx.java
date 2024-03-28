package basic3;

public class IndexOfContainsEx {

	public static void main(String[] args) {

//		String subject="자바 파이썬 프로그래밍 자라 파이썬 자바_스크립트";
		
		// 문자를 찾을 수도 있고, 문자열을 찾을 수도 있다.
		// 찾았을 경우 그 위치(index)가 나옴
		
//		int location=subject.indexOf("자");
//		System.out.println(location);
//		int location2=subject.indexOf("프로그래밍", 1);
//		System.out.println(subject.indexOf("자", 1));
//		System.out.println(location2);
//		
//		// 찾고자 하는 문자, 문자열이 없는 경우 -1이 반
//		int location3=subject.indexOf("가");
//		System.out.println(location3);
//		
//		int location4=subject.indexOf("파이썬",2);
//		System.out.println(location4);
//		
//		int location5=subject.indexOf("자바_스크립트");
//		System.out.println(location5);
//		
//		
//		
//		
//		// 해당 문자나 문자열(자바스크립트)가 없으면 없다.라고 코딩
//		
//		if(location5==-1) {
//			System.out.println("없다");
//		}else {
//			System.out.println("있다");
//		}
		
		System.out.println("---------------------------------");
		
		String subject="자바 파이썬 프로그래밍 자라 파이썬 자바_스크립트";
	
		String[] strArr=subject.split(" ");
		System.out.println(strArr);
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		

	}

}
