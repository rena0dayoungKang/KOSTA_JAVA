import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		//Integer는 이미 compare이 들어가 있는 클래스 타입임
		
		ts.add(34);
		ts.add(67);
		ts.add(25);
		ts.add(12);
		ts.add(7);
		ts.add(77);
		ts.add(70);
		
		System.out.println(ts); //정렬되어서 나온다. 
		
		//1. 70부터 가지고 오고 싶다
		SortedSet<Integer> sortedSet = ts.subSet(70, 80); //80은 포함되지 않음
		System.out.println(sortedSet);
		
		

	}

}
