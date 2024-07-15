//메서드 호출의 순서 
public class MethodTest1 {
	
	void method1(int val) {
		System.out.println("method1 시작");
		int val2 = val;
		method2(val2);
		System.out.println("method1 종료");
	}
	
	void method2(int val) {
		System.out.println("method2 시작");
		val += 10;
		method3(val);
		System.out.println("method2 종료");
	}
	
	void method3(int arg) {
		System.out.println("method3 시작");
		arg += 100;
		System.out.println(arg);
		System.out.println("method3 종료");
	}
	

	public static void main(String[] args) {
		System.out.println("main 시작");
		
//		method1(5); 에러난다. main이 static이고 method1은 인스턴스 메서드라서.
		MethodTest1 methodTest1 = new MethodTest1();
		methodTest1.method1(5);
		
		System.out.println("main 종료");
	}

}
