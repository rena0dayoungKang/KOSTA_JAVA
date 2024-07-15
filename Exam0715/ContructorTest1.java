//생성자 와 오버로딩 
class MyClass {
	int n;
	
	public MyClass() { 
		/*기본생성자 : 파라미터가 없는 생성자 
		 * 직접 만들지 않아도 컴파일 시 자동으로 생성된다. 
		 * 생성자 : new 에 의해 자동 호출됨
		 * 생성자는 클래스 이름과 동일하다 , 그리고 리턴 타입이 없다.
		 * 대부분 public 형태이다. 
		*/
		
		System.out.println("MyClass()");
	}
	
	//생성자도 오버로딩이 가능하다.
	public MyClass(int num) {
		n = num;
		System.out.println("MyClass(int num)");
	}
	
}
public class ContructorTest1 {

	public static void main(String[] args) {
		MyClass mClass = new MyClass(); //자동으로 생성자 호출 
		System.out.println(mClass.n);
		MyClass mClass2 = new MyClass(10);
		System.out.println(mClass2.n);
		
	}

}
