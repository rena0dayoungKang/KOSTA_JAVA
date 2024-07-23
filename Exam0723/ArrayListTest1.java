import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(40);
		a1.add(30);
		a1.add(20);
		a1.add(10);
		
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1); //오름차순 정렬 
		
		ArrayList a12 = new ArrayList();
		a12.add(10);
		a12.add(20);
		a12.add(50);
		
		System.out.println(a1.containsAll(a12));
		
		List a13 = a1.subList(1, 3); //1번째부터 3번째까지 3번빼고 가져오기 
		System.out.println(a13);
		
		a13.set(0, 200);  //0번째를 200으로 바꿔기
		System.out.println(a13);
		
		a13.remove(0);
		System.out.println(a13);
	}

}
