//인터페이스와 다형성
interface ITest {
	void ifunc();
}

class CTest {
	void cfunc() {}
}

class DTest extends CTest implements ITest {
	void dfunc() {}

	@Override
	public void ifunc() {}
	
}

public class IterfaceTest1 {

	public static void main(String[] args) {
		DTest obj1 = new DTest();
		obj1.cfunc();
		obj1.dfunc();
		obj1.ifunc();
		
		CTest obj2 = new DTest();
		obj2.cfunc();	//CTest 메서드 호출만 가능
		//obj2.dfunc();
		//obj2.ifunc();  
		
		ITest obj3 = new DTest();
		obj3.ifunc();	//ITest 메서드 호출만 가능
		//obj3.cfunc();
		//obj3.dfunc();
	}

}
