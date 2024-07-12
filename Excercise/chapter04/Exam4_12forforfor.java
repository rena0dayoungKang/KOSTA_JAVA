package chapter04;

//구구단의 일부분을 다음과 같이 출력하시오
//삼중for문 
public class Exam4_12forforfor {

	public static void main(String[] args) {
//		for (int i = 2; i < 10; i += 3) {
//			for (int j = 1; j <= 3; j++) {
//				for (int k = i; k <= ((k + 2 < 10) ? i + 2 : i + 1); k++) {
//					System.out.printf(("%d * %d = %d\t"), k, j, j * k);
////					System.out.println("k = " + k);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		for (int row = 2; row < 9; row += 3) {
			for (int idx = 1; idx <= 3; idx++) {
				for (int dan = row; dan <= (dan + 2 < 10 ? row + 2 : row + 1); dan++) {
					System.out.print(String.format("%d*%d=%d\t", dan, idx, dan * idx));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
