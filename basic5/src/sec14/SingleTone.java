package sec14;

public class SingleTone {
	
	private static SingleTone singleTone = new SingleTone();	
	private SingleTone() {
		
	}
	
	public static SingleTone getInstance() {
		return singleTone;
	}
}
