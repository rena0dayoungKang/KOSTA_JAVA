//일반변수와 static변수 
class Variable {
	int iv;
	static int sv; // 객체들이 공유하는 static변수

	void method() {
		int lv = 0;
		// 지역변수는 초기화 하지 않으면 사용할수없음.
		System.out.println(lv);
	}
}

public class VariableTest {

	public static void main(String[] args) {
//		System.out.println(Variable.iv); //에러가 난다
		Variable v = new Variable();
		// instance변수는 클래스명으로 접근 할 수 있다.
		System.out.println(v.iv);
		// instance변수는 객체 생성 후 레퍼런스를 통해 접근해야만 한다.

		System.out.println(Variable.sv); // static변수는 new 안 붙이고 바로 쓸 수 있음
		// class변수는 클래스명으로 접근한다. 객체 생성 하지 않아도 이미 생성되어 있다.
		System.out.println(v.sv); // static변수도 레퍼런스를 통해 접근도 할 수 있다.

		Variable.sv = 10;
		System.out.println(v.sv);

		v.method();

		Variable v2 = new Variable();
		System.out.println(v2.sv);

		Variable.sv = 20;
		System.out.println(v.sv);
		System.out.println(v2.sv);

		v.sv++;
		System.out.println(v.sv);
		System.out.println(v2.sv);

	}

}
