package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
		//return o.name.compareTo(name);
		//아스키 코드로 두가지를 비교하기 때문에 o.name과 name의 아스키 코드를 비교해서 큰 값이 먼저 나오게 된다.
		//o.name을 name과 compare하면 역정렬이 된다.
	}
}

public class Exam11_5 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));
		Collections.sort(list);
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

//김자바,1,3,80,80,90,250,83.3
//남궁성,1,2,90,70,80,240,80.0
//안자바,1,5,60,100,80,240,80.0
//이자바,1,4,70,90,70,230,76.7
//홍길동,1,1,100,100,100,300,100.0
