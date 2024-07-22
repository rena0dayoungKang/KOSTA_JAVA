//예외처리의 순서
public class ExceptionTest6 {

	public static void main(String[] args) {
		
		//1. 예외처리의 상속관계가 있다면 자식부터 가장 위에 있어야 한다. 
		try {

		} catch (NullPointerException ne) {

		} catch (Exception ex) {

		}

		//2. 부모 클래스인 Exception에서 먼저 모두 처리해버리기 때문이다. 
		try {

		} catch (Exception ex) {

		} //catch (NullPointerException ne) {}
		

	}

}
