//클래스와 객체
class Person {
	// 사용자(개발자) 정의 [데이터 타입] = 자료형 (원시타입과 같은 레벨)
	// 레퍼런스 타입
	// 타입의 크기 : 4 + 8 = 12바이트
	int age;
	double height;
	String name;

	String info() {
		return String.format("나이 : %d, 이름 : %s, 키 : %.1f", age ,name, height);
	}
}

public class ClassTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		// Person은 클래스
		// new Person은 객체
		// new연산자를 쓴다. 메모리의 Heap영역에 12바이트 크기의 공간을 생성하고 주소값을 참조
		// 모든 타입의 주소지는 4바이트
		// 이 주소값을 p1에 대입하면서 p1은 stack영역에 보관이 된다.
		p1.age = 30;
		p1.height = 175.3;
		p1.name = "홍길동";

		Person p2 = new Person();
		p2.age = 35;
		p2.height = 165.3;
		p2.name = "홍길순";

//		System.out.println(p1.age);
//		System.out.println(p1.height);
//		System.out.println(String.format("나이 : %d, 키 : %.1f", p1.age, p1.height));
//		System.out.println(String.format("나이 : %d, 키 : %.1f", p2.age, p2.height));
		
//		Person p3 = p2; //p3는 new로 객체생성 안하고 p2를 같이 공유해버림 
		Person p3 = new Person(); //new로 객체 생성하고 초기화 함. 
//		p3 = p2; //p2에 있는 주소를 p3에 덮어 써버린다. 그리고 p2를 공유해버림
		//변수를 각각 분리해서 복사해야 변경되어도 값이 바뀌지 않는다. 
		p3.age = p2.age;
		p3.height = p2.height;
		p3.name = p2.name;
		
		p2.age = 40;

//		System.out.println(p1.info());
//		System.out.println(p2.info());
//		System.out.println(p3.info());
		
//		p3.age = 40;
		
		System.out.println(p1.info());
		System.out.println(p2.info());  //잘못하면 p2의 age도 바뀌어 버려버림.
		System.out.println(p3.info());
		

		int n = 10; // 4바이트
		double d = 12.3; // 8바이트
	}

}
