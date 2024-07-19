//인터페이스 와 상속(업캐스팅)

class A {}
//class A extends Object {} 와 같은 의미. 
//자바의 최상위 클래스인 Object로 부터 상속받는다. 
class B {}

//class C extends A,B {} //자바는 클래스의 다중상속을 허용하지 않는다.
class C extends A {}
class D extends B {}

interface I1 {} //interface는 new가 안된다. 
interface I2 {}
class E implements I1, I2 {} //자바는 인터페이스의 다중상속을 허용한다.
class F extends D implements I1, I2 {} //단일 클래스 상속, 다중 인터페이스 상속 

public class InheritTest {

	public static void main(String[] args) {
		A a1 = new A(); 
		Object o1 = new A();
		
		B b1 = new B();
		Object o2 = new B();
		
		C c1 = new C();
		A a2 = new C();
		Object o3 = new C();
		
		D d1 = new D();
		B b2 = new D();
		Object o4 = new D();
		
		E e1 = new E();
		Object o5 = new E();
		I1 i11 = new E();
		I2 i21 = new E();
		
		F f1 = new F();
		D d2 = new F();
		Object o6 = new F();
		I1 i12 = new F();
		I2 i22 = new F();
		
		//I1 ia1 = new I1(); //이렇게 interface는 new로 만들 수 없다. 
		//인터페이스도 업캐스팅이 적용이 된다. 
		
		
		
	}

}
