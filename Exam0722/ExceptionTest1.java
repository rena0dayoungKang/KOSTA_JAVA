//예외처리 1 - nullpointer Exception
public class ExceptionTest1 {

	public static void main(String[] args) {
		String string = null;
		try {
			System.out.println(string.toString()); // 널포인터익셉션 발생.
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");

	}
}