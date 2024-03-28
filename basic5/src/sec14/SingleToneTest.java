package sec14;

public class SingleToneTest {

	public static void main(String[] args) {
		SingleTone obj1 = SingleTone.getInstance();
		SingleTone obj2 = SingleTone.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
