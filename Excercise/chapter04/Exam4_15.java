package chapter04;

public class Exam4_15 {
	public static void main(String[] args) {
		int number = 13531;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		while (tmp != 0) {
//			result *= 10;
//			result += tmp % 10;
			result = (result *10) + (tmp % 10);
			tmp /= 10;
		}

		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}
