
public class IfTest1 {

	public static void main(String[] args) {
		int kor = 80, eng = 92, math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		String grade;
		
		//소수점 둘째 자리까지 반올림 출력 
		System.out.println(avg);
		System.out.println(Math.round(avg*100));
		System.out.println(Math.round(avg*100)/100f);
		
		//중첩 if 에서는 반드시 else를 고려해서 빠지는 경우의 수가 없어야 한다. 
		//따라서 중첩if보다 if문을 한단계만 쓰는게 좋다. 
		if (avg >= 90) {
			grade = "A";
			if (avg >= 98) {
				grade += "+";
			} else if (avg >= 94) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (avg >= 80) {
			grade = "B";
			if (avg >= 98) {
				grade += "+";
			} else if (avg >= 94) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (avg >= 70) {
			grade = "C";
			if (avg >= 98) {
				grade += "+";
			} else if (avg >= 94) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if (avg >= 60) {
			grade = "D";
			if (avg >= 98) {
				grade += "+";
			} else if (avg >= 94) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

}
