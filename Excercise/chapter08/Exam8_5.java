package chapter08;

public class Exam8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) { //ArithmeticException의 엄마 
			System.out.println(3);
			return; //return 되기 전에 finally 찍고 return 
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6); //method(true)일때는 6을 안찍는다
	}

	public static void main(String[] args) {
		method(true);
		System.out.println();
		method(false);

	}

}
