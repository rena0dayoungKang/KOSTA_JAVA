package chapter04;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();

		// 내생각
		for (int i = 1; i < 10; i++) {
			if (dan1 > dan2) {
				for (int j = dan1; j > dan1 - dan2; j--) {
					System.out.printf("%d * %d = %d  ", j, i, j * i);
				}
			} else if (dan1 <= dan2) {
				for (int j = dan1; j <= dan2; j++) {
					System.out.printf("%d * %d = %d ", j, i, j * i);
				}
			}
			System.out.println();
		}

		// 선샌님
//		for (int i = 1; i < 10; i++) {
//			if (dan1 < dan2) {
//				for (int dan = dan1; dan <= dan2; dan++) {
//					System.out.print(String.format("%d * %d = %2d ", dan, i, dan * i));
//				}
//			} else {
//				for (int dan = dan1; dan >= dan2; dan--) {
//					System.out.print(String.format("%d * %d = %2d ", dan, i, dan * i));
//				}
//			}
//			System.out.println();
//		}

	}

}
