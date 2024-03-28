package basic3;

public class ReferenceEx2 {

	public static void main(String[] args) {

		new String();
		System.out.println(new String());
		System.out.println(System.identityHashCode(new String()));
		System.out.println("----------------------------");
		String hello1=new String("hi");
		System.out.println(hello1);
		System.out.println(System.identityHashCode(hello1));
		System.out.println("----------------------------");
		String hello2=new String("hi");
		System.out.println(hello2);
		System.out.println(System.identityHashCode(hello2));
		System.out.println("----------------------------");
		System.out.println(hello1==hello2);
		System.out.println(hello1.equals(hello2));
		
		
	}

}
