package chapter05;

import java.util.Scanner;

//5개의 정수를 입력받은 후 차례로 출력하는 프로그램을 작성하시오.
public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
