package chapter11.ex8;
//문제11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import chapter06.SutdaCard;

//를 추가하였다. 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오. 
//(1)~(2)에 알맞은 코드를 넣어 완성하시오.

class ClassTotalComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		return o1.ban - o2.ban != 0 ? o1.ban - o2.ban : o2.getTotal() - o1.getTotal();
		// 같은 반이면 total로 descending 
	}
}

public class Exam11_9 {

	public static void calculateClassRank(List<Student> list) {
		// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for (int i = 0; i < length; i++) {
			Student stud = list.get(i);
			if (stud.ban != prevBan) {
				stud.classRank = 1;
				prevRank = 1;
				prevTotal = stud.getTotal();
			} else {
				if (stud.getTotal() == prevTotal) {
					stud.classRank = prevRank;
				} else {
					stud.classRank = prevRank +1;
				}
			}
			
			prevBan = stud.ban;
			prevTotal = stud.getTotal();
			prevRank = stud.classRank;
			
			//System.out.println("반등수 : " + stud.classRank);
		}
		
		/*
		 * (2) 아래의 로직에 맞게 코드를 작성하시오. 
		 * 1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다. 
		 * 1.1 반이 달라지면,(ban과 prevBan이 다르면) 이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화 한다. 
		 * 1.2 총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를 등수(schoolRank)로 한다. 
		 * 1.3 총점이 서로 다르면, 등수(schoolRank)의 값을 알맞게 계산해서 저장한다. 
		 * 이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야한다. (실행결과 참고) 
		 * 1.4 현재 반과 총점과 등수를 이전 반(prevBan), 이전 총점(prevTotal), 이전 등수(prevRank)에 저장한다.
		 */
	} 

	public static void calculateSchoolRank(List<Student> list) {
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for (int i = 0; i < list.size(); i++) {
			Student std = list.get(i);
			std.rank =i+1;
		}
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
