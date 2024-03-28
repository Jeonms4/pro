package classBasic;

public class StudentExample {

	public static void main(String[] args) {
		// new Student();
		// System.out.println(new Student());

		// stu1은 객체(instance)
		Student stu1 = new Student();

		//System.out.println(stu1);
		stu1.name = "홍길동";
		System.out.println(stu1.name);

		Student stu2 = new Student();
		stu2.name = "홍이동";
		System.out.println(stu2.name);

	}

}
