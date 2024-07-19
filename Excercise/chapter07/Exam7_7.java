package chapter07;
//다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

public class Exam7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		//1. 자식이 생성되면서 자식변수와 부모변수가 생성되고 초기화됨.
		//자식 기본 생성자를 호출하면서 부모의 기본생성자를 호출하게 된다.
		//부모의 기본생성자를 통해 부모의 int x 생성자를 호출하게 된다. 
		//부모의 변수가 200으로 변경된다.
		//2. 다시 자식 기본생성자에서 자식의 int x생성자를 호출하게 된다.
		//자식의 변수가 1000으로 변경된다. 
		System.out.println("x=" + c.getX());
		//

	}

}


