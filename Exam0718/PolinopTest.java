//다형성
class Base {
	int baseNum;
	void baseMethod() {}
	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int derivedNum;
	void derivedMethod() {}
	
	@Override
	void method() {
		System.out.println("Derived method");
	}
}

public class PolinopTest {

	public static void main(String[] args) {
		
		Base base = new Base();
		base.baseNum = 10;
		base.baseMethod();
		
		Derived derived = new Derived();
		derived.baseNum = 20;
		derived.derivedNum = 100;
		derived.baseMethod();
		derived.derivedMethod();
		//base, derived가 레퍼런스 라고도 한다.
		
		
		Base base2 = new Derived(); //Up- Casting : 자식 객체를 부모 레퍼런스 변수(base2)에 담는다. 
		//상속관계에 한해서는 자식을 부모에 리턴 가능
		//Derived derived = new Base(); 부모를 자식에 담을 수 없음 
		base2.baseNum = 30;
		base2.baseMethod();
		base2.method(); //다형성
		//base2.derivedNum = 200; 
		//base2.derivedMethod(); 
		
		/*Up-Casting을 언제 쓸까?
		 *부모타입을 큰 펜 객체라고 생각하고, 자식타입을 사인펜, 초코펜 등등을 크게 쓸 수 있다  
		 * 
		 * 
		 * */
		
		//Derived derived2 = base2; //다운캐스팅은 자동으로 되지 않는다. 
		Derived derived2 = (Derived)base2; //수동을 다운 캐스팅 한 것. Down-Casting 
		//형변환 타입캐스팅 처럼 이용 
		derived2.baseNum = 20;
		derived2.derivedMethod();
		
		//Derived derived3 = (Derived)base; 이렇게는 쓰면 안된다. 실제 new한게 derived가 아니기 때문
		
		
	}

}
