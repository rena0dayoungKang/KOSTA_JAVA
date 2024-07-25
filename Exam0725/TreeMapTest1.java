import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap 활용
public class TreeMapTest1 {

	public static void main(String[] args) {
		TreeMap<String, Account> accs = new TreeMap<>();
		// TreeSet은 Comparable을 구현해야 하지만 TreeMap은 Comparable이 내장되어 있음

		accs.put("1003", new Account("1003", "tong", 300000));
		accs.put("1002", new Account("1002", "song", 200000));
		accs.put("1005", new Account("1005", "bong", 500000));
		accs.put("1001", new Account("1001", "hong", 100000));
		accs.put("1004", new Account("1004", "gong", 400000));

		// System.out.println(accs);
		// 순서대로 정렬되어 들어가있음. Tree의 특성

		Account acc = accs.get(accs.firstKey());
		// Account acc = accs.firstKey();
		// System.out.println(acc);
		Account acc2 = accs.get(accs.lastKey());
		// System.out.println(acc2);

		// 특정 키 부터 끝까지 가져오기
		SortedMap<String, Account> sm = accs.tailMap("1004");
		System.out.println(sm);
		// 특정 키의 값 부터 끝 키 까지의 값 가져오기
		System.out.println(sm.values());

	}

}
