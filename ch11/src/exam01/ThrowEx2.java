package exam01;

public class ThrowEx2 {
	
	static void findClass() throws Exception{
		Class obj = Class.forName("java.lang.String");
		System.out.println(obj);
		
		System.out.println("hi");
	}

	public static void main(String[] args){
		try {
			findClass();
		} catch(Exception e) {
			System.out.println("클래스명 확인");
		}
	}

}
