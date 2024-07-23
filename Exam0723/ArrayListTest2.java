import java.util.ArrayList;
import java.util.Iterator;

class Person {
	Integer age;
	String name;

	Person(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	void info() {
		System.out.println("[" + name + "," + age + "]");
	}

	@Override
	public String toString() {
		return "[" + name + "," + age + "]";
	}
}

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Person> alist1 = new ArrayList<>();
		alist1.add(new Person(20, "홍길동"));
		alist1.add(new Person(30, "김길동"));
		alist1.add(new Person(20, "하길동"));
		alist1.add(new Person(30, "허길동"));
		alist1.add(new Person(20, "송길동"));

		for (int i = 0; i < alist1.size(); i++) {
			Person person = alist1.get(i);
			// ArrayList는 Object 파라미터를 물고 있어서 return타입이 Object타입이다.
			// 그래서 객체 Person으로 다운캐스팅 해야하는데
			// 매번 다운캐스팅 하기 힘들기 때문에 ArrayList에 Generic을 사용한다
			// p.info();
		}

		// 향상된 for문 사용
		for (Person person : alist1) {
			// person.info();
		}

		// Iterator 반복자 사용
		// 가장 정형화된 반복자. 반복을 돌면서 데이터 삭제하거나 할때는 iterator사용하기
		// while이나 for문은 데이터를 뽑아올때만 편함 
		Iterator<Person> it = alist1.iterator();
		while (it.hasNext()) {
			it.next().info();
		}

		System.out.println(alist1); // toString()해주지 않으면 클래스 이름과 주소값이 나오게 됨
		// toString()오버라이딩해서 맞춰 줄 수 있다.

	}

}
