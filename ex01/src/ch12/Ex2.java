package ch12;

public class Ex2 {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread2();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.run();
	}

}
