package chapter09;

public class Exam9_12 {

	// (1) getRand메서드를 작성하시오.
	public static int getRand(int from, int to) {
		// [Hint] Math.random()과 절대값을 반환하는 Math.abs(int a),
		// 그리고 둘 중에 작은 값을 반환하는 Math.min(int a, int b)를 사용하라.

		int min = Math.min(from, to); // -3
		int max = Math.max(from, to); // 1

		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}

	}

}
