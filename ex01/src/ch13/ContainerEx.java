package ch13;

public class ContainerEx {

	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("홍길동", "도적");
		
		String name =container1.getKey();
		System.out.println(name);
		
		String value= container1.getValue();
		System.out.println(value);
	}

}
