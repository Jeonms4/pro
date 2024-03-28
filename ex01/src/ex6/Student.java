package ex6;

public class Student {
	String name;
	int ban, no, kor, eng, math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name +", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
	}
	
	int getTotal() {
		return kor + eng+ math;
	}
	
	float getAverage() {
		return getTotal()/3;
	}
}
