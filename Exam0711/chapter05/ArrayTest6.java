package chapter05;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[100];
		// 내생각
		int max_value = -999, min_value = 998;
		for (int i = 0;; i++) {
			numbers[i] = sc.nextInt();
			if (numbers[i] == 999)
				break;
			if (numbers[i] > max_value) {
				max_value = numbers[i];
			}

			if (numbers[i] < min_value) {
				min_value = numbers[i];
			}
		}

		// 선생님
//		int min = 0, max = 0, cnt = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			int input = sc.nextInt();
//			if (input == 999)
//				break;
//			numbers[i] = input;
//			cnt++;
//		}
//
//		min = max = numbers[0];
//		for (int i = 1; i < cnt; i++) {
//			if (numbers[i] > max)
//				max = numbers[i];
//			if (numbers[i] < min)
//				min = numbers[i];
//		}

		System.out.println("max : " + max_value);
		System.out.println("min : " + min_value);
	}

}
