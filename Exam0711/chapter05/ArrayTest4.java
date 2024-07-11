package chapter05;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력 : ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.print("출력 : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
//입력 : 5
//2 4 6 8 5 옆으로 입력받기
//출력 : 2 4 6 8 5
