package chapter05;

import java.util.Scanner;

public class Jungol1 {
//1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 
//그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[11]; //입력받은 값이 1부터 11까지만 나오게 

		 //2.
		while (true) {
			int input = sc.nextInt();
			if (input < 1 || input > 10) break;
			numbers[input]++;
		}
		
		for (int i = 1; i <numbers.length; i++) {
			if(numbers[i] == 0) continue;
			System.out.println(String.format("%d : %d 개", i, numbers[i]));
		}
	}

}
