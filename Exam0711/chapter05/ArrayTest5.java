package chapter05;

import java.util.Scanner;

//정올 배열1 - 형성평가9
public class ArrayTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0, cnt = 0;
		int[] numbers = new int[100];
		while (true) {
			numbers[i] = sc.nextInt();
			if (numbers[i] == 0) {
				break;
			}
			cnt++;
			if (numbers[i] % 2 == 0) {
				numbers[i] /= 2;
				i++;
			} else {
				numbers[i] *= 2;
				i++;
			} //짝수와 홀수 는 왜 if 와 else만 사용할 수 있을까? 
		}

		System.out.println(cnt);
		for (int j = 0; j < cnt; j++) {
			System.out.print(numbers[j] + " ");
		}

		
		
//		//1. 정수가 최대 100개 저장될 배열을 생성한다. 
//		int[] arr = new int[100];
//		
//		//2. 입력횟수를 저장할 변수를 선언한다.
//		int cnt = 0;
//		
//		//3. 반복문을 통해 입력받은 값을 배열에 저장한다. 단, 0을 입력받으면 반복문을 빠져나온다.
//		//입력받을 때마다 입력횟수를 증가시킨다.
//		for (int i = 0; ; i++) {
//			int input = sc.nextInt();
//			if (input == 0) break;
//			arr[i] = input;
//			cnt++;
//		}
//		
//		//4. 입력횟수만큼 배열의 데이터를 하나씩 가져와 홀수는 값에 2를 곱하고, 짝수는2를 나누어출력
//		for (int i = 0; i < cnt; i++) {
//			if (arr[i]%2==0) {
//				System.out.print(arr[i]/2+" ");
//			} else {
//				System.out.print(arr[i]*2+" ");
//			}
//		}

	}

}
