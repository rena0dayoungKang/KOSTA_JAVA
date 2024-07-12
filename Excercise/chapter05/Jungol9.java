package chapter05;

import java.util.Scanner;

//10 미만의 자연수 두 개를 입력받아서 
//첫 번째 항과 두 번째 항을 입력받은 수로 초기화 시킨 후
//세 번째 항부터는 전전항과 전항의 합을 구하여 
//그 합의 1의 자리로 채워서 차례로 10개를 출력하는 프로그램을 작성하시오.
public class Jungol9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[10];
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		
		for (int i = 2; i < numbers.length; i++) {
			numbers[i] = (numbers[i-2] + numbers[i-1]) % 10;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}

	}

}

//3 5

//3 5 8 3 1 4 5 9 4 3