//익셉션의 선언부 추가
import java.io.IOException;

public class ExceptionTest8 {

	public static void func() throws IOException, ClassNotFoundException {
		int n = 2;
		if (n == 1) {
			// throw new Exception("내가 만든 강제 예외"); //Exception은 제일 상위클래스임
		} else if (n == 2) {
			throw new IOException("입출력 예외");
		} else if (n == 3) {
			throw new ClassNotFoundException("클래스 예외"); // 런타임 익셉션이 아니라서 위에 선언부에추가
		}
		// throw new Exception("내가만든 강제 예외"); //에러남
		throw new RuntimeException("런타임 익셉션"); // 런타임 익셉션 밑에 있는 자식들은 선언부 생략가능
		// 익셉션을 메서드 위에 선언부에다가 추가로 명시해주면 에러안남
	}

	
	public static void main(String[] args) {

	}

}

//접근제어자는 부모보다 넓힐 수 있지만 좁힐 수 없다. 
