package InterfaceEx;

public class ServiceTest {

	public static void main(String[] args) {
		//new Service();
		
		ServiceImp1 service = new ServiceImp1();
		
		// 클래스 구현 시 그 클래스가 구현한 인터페이스가 있을 경우
		// 인터페이스 변수로 타입을 선언 후 사용, 그래야 다양한 형태로 사용 가능
		
		service.defaultMethod1();

	}

}
