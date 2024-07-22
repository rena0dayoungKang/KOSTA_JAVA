package chapter08;

public class Exam8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				//System.exit(0); //return은 다시 되돌아 가는거지만 exit는 무조건 종료 
				return;
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		System.out.println();
		method(false);

	}

}
