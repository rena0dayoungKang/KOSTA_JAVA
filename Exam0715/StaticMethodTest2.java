//static 메서드 2
class MyMath2 {
	static int add(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return y != 0 ? x / y : 0;
	}
}

public class StaticMethodTest2 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(3, 5));
		System.out.println(MyMath2.sub(10, 2));
		System.out.println(MyMath2.mul(5, 7));
		System.out.println(MyMath2.div(10, 2));
	}

}
