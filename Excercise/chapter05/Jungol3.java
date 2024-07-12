package chapter05;

import java.util.Scanner;

//정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 
//그 때까지 입력된 정수의 일의 자리 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
public class Jungol3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int input = sc.nextInt();
		// 0~9까지의 갯수가 들어가는 배열을 만들기
		int[] cnt = new int[10];
//
//		while (true) {
//			if (input == 0) {
//				break;
//			} else if (input != 0) {
//				cnt[input % 10]++;
//			}
//		}
//
//		for (int i = 0; i < cnt.length; i++) {
//			System.out.println(cnt[i]+"개");
//		}

		while (true) {
			int input = sc.nextInt();
			if (input == 0)
				break;
			cnt[input % 10]++;
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 0) continue;
			System.out.println(String.format("%d : %d개", i, cnt[i]));
		}

	}
}
