
public class ExceptionTest7 {

	public static void func() {
		try {
			String string = "string";
//			String string = null;
			System.out.println("스타트");
			System.out.println(string.toCharArray());
//			System.out.println("마무리");
			return;
		} catch (Exception e) {
			System.out.println("예외처리");
			// System.out.println("catch에서 마무리");
			return;
		} finally {
			System.out.println("마무리");
		}

		// finally구문이 없어도 동일하게 진행할 수 있지만 finally의 장점은 return이 있을때도 마무리가 된다.
		// 코드가 길어질 수록 중간에 return이 있을 수 있기 때문에 finally에서 총 마무리가 필요하다.
		// 중간에 return이 생기더라도 finally 구문이 처리 되기 때문임
	}

	public static void main(String[] args) {
		func();
	}

}
