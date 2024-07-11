package chapter04;

public class Exam4_11 {

	public static void main(String[] args) {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1 + "," + num2);

		for (int i = 0; i < 8; i++) {
			// (1)
			num3 = num2 + num1;
			System.out.print("," + num3);

			// (2)
			num1 = num2;

			// (3)
			num2 = num3;

		}
	}

}

//(1) num3 = num2 + num1 
//(2) num1 = num2
//(3) num2 = num3
//(2)번과 (3)번의 순서가 바뀌지 않아야 한다. 
