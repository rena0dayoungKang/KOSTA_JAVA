
public class ExceptionTest5 {

	public static void func() {
		String string = null;

		try {
			System.out.println(string.toString());
		} catch (NullPointerException e) {
			// e.printStackTrace(); //시스템이 죽은게 아니라 오류를 찍었을 뿐임.
			System.out.println("func 예외처리");
			throw e; // 호출 한 애로 위임한다.
		}
		System.out.println("func 종료");
	}

	public static void func2() {
		try {
			func();
		} catch (NullPointerException e) {
			System.out.println("func2 예외처리");
		}

		System.out.println("func2 종료");
	}

	public static void main(String[] args) {
		// func(); //func호출 시 널포인트 익셉션 발생함. 에러가 난 위치와, 에러를 호출 한 위치가 나옴
		func2(); // 예외를 처리할 수 있는 위치가 몇가지 나온다는 의미. 셋중 하나에만 예외처리 넣어도 된다.
		System.out.println("main 종료");
	}

}

//예외처리는 어디서 처리하는게 좋을까?
//가장 최근 호출한 부분에서 한번에 처리하는게 좋다. 즉 main에서 예외처리를 한꺼번에 할 수 있는 장점 