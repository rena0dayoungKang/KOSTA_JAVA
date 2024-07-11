package chapter05;

public class LottoExam {

	public static void main(String[] args) {
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball[0]인덱스에 1로 먼저 초기화

		}

		for (int i = 0; i < 200; i++) {
			int idx1 = (int) (Math.random() * 45); // 0~44까지 나오면 되니까 +1안했음
			int idx2 = (int) (Math.random() * 45);
			// swap
			int t = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = t;
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		//왜 중복숫자가 안나오는거지? = idx가 랜덤으로 나오기 때문에 중복 idx가 나와도 상관없다.

	}

}
