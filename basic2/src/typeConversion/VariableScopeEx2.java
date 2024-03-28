package typeConversion;

public class VariableScopeEx2 {
	public static void main(String[] args) {
		
		if(true) {
			int v1 = 15;
			System.out.println(v1);
		}
		// System.out.println(v1); // 지역변수
	}
}
