package chapter06;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		int total = kor + eng + math;
		return total;
	}

	float getAverage() {
		// 소수점 둘째자리에서 반올림할 것. = 소숫점 첫째자리까지 반환 
		float average = getTotal() / 3f;
		//math.round는 소수점 첫째 자리에서 정수형으로 반환한다. 
		return Math.round(average*10)/10f;
	}
	

	public Student() {}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	
	String info() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %.1f", name, ban, no, kor, eng, math, getTotal(), getAverage());
	}
	
	

}
