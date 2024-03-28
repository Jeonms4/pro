package basic3;

public class StringEx1 {

	public static void main(String[] args) {

		//문자열 추출
		String ssn="9506246230123";//950624-1230123
		
		int ssnLength=ssn.length();
		System.out.println(ssn.length());
		System.out.println(ssnLength);
		System.out.print(ssn.charAt(6));
		
		
		char ch1=ssn.charAt(6);
//		System.out.println(ch1=='1'||ch1=='3');
		if(ch1=='1'||ch1=='3') {
			System.out.println(": 남성\n");
		}else if(ch1=='2'||ch1=='4') {
			System.out.println(": 여성\n");
		}else {
			System.out.println(": 값이 잘못되어 성별을 구분할 수 없습니다.");
		}
		
//		String str="12345";
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			System.out.println(ch-'0');
//		}
		
	}

}
