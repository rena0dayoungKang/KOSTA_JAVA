//static 메서드 
//프로그램이 시작할 때 ( = class가 로드되는 시점 ) static이 만들어진다. 
class Test {
	int iv;
	static int sv;
	
	void method1() {
		System.out.println("method1");
		iv = 100;
		sv = 200; //instance메서드에서는 static 변수를 사용 할 수 있다.
		method2(); //instance메서드에서는 static 메서드를 사용 할 수 있다.
	}
	static void method2() {
		System.out.println("method2");
//		iv = 200;
//		System.out.println(iv); //static 메서드에서는 instance변수를 사용할 수 없다. 
//		method1(); //static메서드에서는 instance함수도 호출 할 수 없다. 
		sv = 300;
		System.out.println(sv);
	}
	
}


public class StaticMethodTest {

	public static void main(String[] args) {
		Test.method2();
//		Test.method1();  
		
		Test test = new Test();
		test.method1();
	}

}
