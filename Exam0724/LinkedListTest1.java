//LinkedList의 다양한 활용
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListTest1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.addFirst(40);
		System.out.println(list);
		
		list.addLast(50);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		list.add(2, 60);
		System.out.println(list);
		
		Vector<Integer> v = new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//ArrayList와 Iterator, Vector와 Enumeration
		
	}

}
