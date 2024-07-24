import java.util.HashSet;
//HashSet 활용
public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(32);
		hs.add(17);
		hs.add(84);
		hs.add(17);
		hs.add(100);
		hs.add(33);

		System.out.println(hs);

		HashSet<Person> hsp = new HashSet<>();
		hsp.add(new Person(20, "홍길동"));
		hsp.add(new Person(30, "김길동"));
		hsp.add(new Person(10, "하길동"));
		hsp.add(new Person(40, "허길동"));

		System.out.println(hsp);

		hsp.add(new Person(20, "홍길동"));
		// 중복X인데 홍길동 두개가 됨.
		// HashSet 과 더불어 equals와 hashcode오버라이딩 둘다를 만족해야 중복제거됨
		System.out.println(hsp);
	}

}
