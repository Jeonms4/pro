package Inheritance4;

public class InstanceofEx {
	static void personInfo(Person person) {
		System.out.println("이름 :" + person.name);
		person.walk();
		
		// person이 참조하는 객체가 Student 타입인지 확인하는 객체
		if(person instanceof Student) {
			Student stu = (Student)person;
			System.out.println("학번 : " + stu.studentNo);
			stu.study();
		}
	}
	
	public static void main(String args[]) {
		
		Person p1 = new Person("홍길동");
		
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		
		System.out.println(p1.name);
		
		personInfo(p1);
		
		Student stu1 = new Student("홍학생", 111);
		Person p2 = stu1;
		
		System.out.println(stu1 instanceof Person);
		System.out.println(stu1 instanceof Student);
		
		personInfo(stu1);
		personInfo(new Student("중학생", 222));
	}
}
