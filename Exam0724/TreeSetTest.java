import java.util.Comparator;
import java.util.TreeSet;

class EmpCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getPay() - o2.getPay();
		// 급여가 같고 이름이 다르더라도 tree구조이기 때문에
		// 비교 값 return 이 0이면 add가 안된다. 저장자체가 안됨
		// 송길동~ 최길동은 입력안됨.
		// Hash 구조는 add는 된다.
		// tree구조라서 왼쪽 노드와 오른쪽 노드의 pay값이 비교되기 땜문
		// TreeSet은 Compare구현이 필수적임
	}

}

//TreeSet 활용
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();

		ts.add(new Person(20, "홍길동"));
		// error. class Person cannot be cast to class
		// Person클래스에서 Comparable 을 implements해준다
		// Person클래스를 comparable클래스로 캐스트해서 쓴다
		ts.add(new Person(10, "김길동"));
		ts.add(new Person(50, "차길동"));
		ts.add(new Person(40, "장길동"));
		ts.add(new Person(30, "하길동"));

		//System.out.println(ts);
		// 나이 순서대로 출력되네요. age로 compare메서드 만들었기때문

		TreeSet<Person> ts2 = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		}); // 생성자에 comparator 넣어주면서 compare오버라이딩
		ts2.add(new Person(10, "김길동"));
		ts2.add(new Person(50, "차길동"));
		ts2.add(new Person(40, "장길동"));
		ts2.add(new Person(30, "하길동"));
		//System.out.println(ts2);

		TreeSet<Employee> ets = new TreeSet<>(new EmpCompare());
		ets.add(new Employee("강길동", 1000000));
		// 1. 중복 데이터 인지 확인 equals,hascode 오버라이딩필요
		// 2. TreeSet(Comparator) 사용. 클래스를 위에 생성해줬다
		// Comparator 보다 Comparable이 우선순위가 있음
		ets.add(new Employee("강길동", 1000000));
		ets.add(new Employee("송길동", 2000000));
		ets.add(new Employee("고길동", 3000000));
		ets.add(new Employee("최길동", 4000000));

		//System.out.println(ets);

		TreeSet<Employee> ets2 = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getPay() - o2.getPay();
			}
		});
		ets2.add(new Employee("강길동", 50));
		// 1. 중복 데이터 인지 확인 equals,hascode 오버라이딩필요
		// 2. TreeSet(Comparator) 사용. 클래스를 위에 생성해줬다
		// Comparator 보다 Comparable이 우선순위가 있음
		ets2.add(new Employee("강길동", 50));
		ets2.add(new Employee("송길동", 20));
		ets2.add(new Employee("고길동", 10));
		ets2.add(new Employee("최길동", 30));

		System.out.println(ets2);
	}

}
