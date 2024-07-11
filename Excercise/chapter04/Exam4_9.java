package chapter04;

public class Exam4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			// '5' - '0' 이렇게 하면 숫자 5가 되는 효과와 같겠다.
			sum += str.charAt(i) - '0';

		}
		System.out.println("sum=" + sum);
	}

}
