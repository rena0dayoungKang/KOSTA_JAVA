//Object클래스의 메서드
class Person implements Cloneable{
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { // object클래스의 equals오버라이딩
		if (!(obj instanceof Person))
			return false; // obj가 Person객체에 해당하지 않으면 false
		Person person = (Person) obj; // obj를 Person클래스로 다운캐스팅
		return age == person.age && name.equals(person.name);
	}

	@Override
	public int hashCode() { // 중복데이터를 거를 때 hashCode를 사용한다.
		return age + name.hashCode();
		// 문자열은 그 자체로 hashCode를 가지고 있음.
	}

	@Override
	public String toString() { //
		return "이름 :" + name + ", 나이 :" + age;
	}

	@Override
	protected Object clone() { //class에 implements Cloneable해주어야 한다~!
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "hong";
//		p1.age = 20;
//		
//		Person p2 = p1;  //복사의 의미가 아님. p2가 p1을 같이 공유(참조)의 의미

		// 1. clone
		// p1.clone(); //clone은 protected 접근제어자로 막아 뒀기 때문이다.

		// 2. equals 같은 객체인지 알려준다.
		// String클래스에서는 문자열 하나하나씩 비교되는 메서드로 오버라이딩 되어 있기때문에 바로 활용 가능

		// 3. toString()
		// 모든 클래스는 toString을 가지고 있고, info()의 역할을 함.

		// 4. notify(), wait() ==> 멀티스레딩 환경에서 사용
		// 운영체제의 멀티프로세스 환경에서 나오는 용어에서 유래.
		// 동시에 여러가지의 프로세스가 실행되는 환경에서 자원이 공유되는 상황

		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person(20, "홍길동");
		Person p3 = new Person(20, "고길동");
		Person p4 = new Person(22, "홍길동");
		System.out.println(p1 == p2); // 다른 레퍼런스를 참조하기 때문 주소값이 다르기 때문이다.
		System.out.println(p1.equals(p2)); // object클래스의 equals는 같은 객체인지를 비교한다.
		// object클래스의 equals오버라이딩해서 equals를 비교하게 되면 true가 나온다.
		// System.out.println(p1);
		// System.out.println(p2);

		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());

		System.out.println(p1.toString()); // 이름 : 홍길동, 나이 : 20나오게 오버라이딩 해보기
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4); // toString안해도 잘 나온다~
		// println은 대표적인 Object의 toString 오버라이딩 중 하나이다.

		Person p5 = (Person) (p1.clone()); // 괄호를 안해주면 점 연산자가 먼저 되버림
		System.out.println(p5);
	}

}
