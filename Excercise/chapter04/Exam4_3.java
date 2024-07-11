package chapter04;

public class Exam4_3 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
	}

}
//							i	j
//1							1	1
//1+2						2	2
//1+2+3						3	3
//1+2+3+4...				4	4
//1+2+3+.....+10 10행		10	10