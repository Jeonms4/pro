package ch14;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread1();
		thread1.start();

		Thread thread2 = new Thread();
		thread2.start();
	}
}