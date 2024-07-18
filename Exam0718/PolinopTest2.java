//다형성
class Derived2 extends Base {
	
	@Override
	void method() {
		System.out.println("Derived2 method");
	}
	
}

public class PolinopTest2 {

	static Base[] baseList = new Base[100];
	static int baseCnt;
	
	static Derived[] derivedList = new Derived[100];
	static int derivedCnt;
	
	//1.
//	static Derived2[] derived2List = new Derived2[100];
//	static int derived2Cnt;
	
	static void addBase(Base base) {
		baseList[baseCnt++] = base;
	} 
	
	static void addDerived(Derived derived) {
		derivedList[derivedCnt++] = derived;
	}
	
	//1.
//	static void addDerived2(Derived2 derived2) {
//		derived2List[derived2Cnt++] = derived2;
//	}
	
	static void callAllMethod() {
		for (int i = 0; i < baseCnt; i++) {
			baseList[i].method();
		}
	}
	
	public static void main(String[] args) {
		
		Base base1 = new Base();
		Base base2 = new Base();
		Derived derived1 = new Derived();
		Derived derived2 = new Derived();
		
		//만약 base100 까지 만들고 derived100까지 만들어서 배열에 저장하고 싶으면?
		//1. 배열 Base[] 와 Derived[] 배열 두개가 필요하지
//		addBase(new Base());
//		addBase(new Base());
//		addDerived(new Derived());
//		addDerived(new Derived());
		
		//2. up casting을 만들면 
		Base base = new Derived();
		
//		Base[] blist = new Base[5];
//		blist[0] = new Derived();
//		blist[1] = new Base();
//		blist[2] = new Derived2();
		//자식 객체를 부모 배열 타입에 넣을 수 있는 것이다. 
		
		addBase(new Base());
		addBase(new Base());
		addBase(new Derived());
		addBase(new Derived2());
		//업캐스팅의 장점 : 
		//새로운 코드나 클래스가 추가되더라도 걔를 관리하거나 통제하는 코드가 따로 필요 없다는 장점
		callAllMethod();
		
	}

}
