package chapter08;

public class Exam8_10 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);// 예외가 발생했기 때문에 6을 안찍음
		} catch (Exception e) {
			System.out.println(7);
		}

	}

	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2);
			throw e;
		} catch (Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	} // method1()

	static void method2() {
		throw new NullPointerException();
		// 넖인트 익셉션은 Runtime익셉션의 자식이라서 throws생략 가능
	}

}
