package chapter04;

//구구단의 일부분을 다음과 같이 출력하시오
public class Exam4_12 {

	public static void main(String[] args) {
		for (int row = 2; row < 9; row += 3) {
			for (int idx = 1; idx <= 3; idx++) {
				for (int dan = row; dan <= (dan + 2 < 10? row+2:row+1) ; dan++) {
						System.out.print(String.format("%d*%d=%d\t", dan, idx, dan*idx));
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
