//다형성
package chapter07;

public class Exam7_20 {

	public static void main(String[] args) {
		Parnent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x = " + p.x);
		//p로는 new를 child로 했어도 child의 x에 접근할 수 없음 
		p.method();
		//오버라이딩 한 것만 new로 접근 할 수 있다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		System.out.println();
		
		System.out.println("c.x = " + c.x);
		c.method();

	}

}

class Parnent1 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parnent1 {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}
