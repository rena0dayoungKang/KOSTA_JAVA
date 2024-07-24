package chapter11;
//다음에 제시된 BanNoAscending클래스를 완성하여, ArrayList에 담긴 Student인

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.
//(반이 같은 경우 번호를 비교해서 정렬한다.)

class BanNoAscending implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		
		
//		if (o1.ban > o2.ban) { //반번호로 먼저 우선순위 체크 
//			return 1;
//		} else if (o1.ban < o2.ban) {
//			return -1;
//		} else { //반이 같으면 번호 순서대로 
//			return o1.no - o2.no;
//		}

		//다른방법도 있다. 
		return (o1.ban - o2.ban != 0) ? o1.ban - o2.ban : o1.no - o2.no;
	}
}

public class Exam11_7 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));

		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
