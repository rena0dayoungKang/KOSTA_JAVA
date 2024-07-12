import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		 1번 배열방법
		int[] arr = new int[100];
		int number = sc.nextInt();
		arr[0] = 100;
		arr[1] = number;
		int cnt = 0;
		// 0은자연수가 아니라서 가장 작은 자연수는 1
		for (int i = 2; i < 100; i++) {
			arr[i] = arr[i - 2] - arr[i - 1];
			if (arr[i] < 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				continue; // 배열을 돌다가 0 이면 넘어가라~
			System.out.print(arr[i] + " ");
		}

		// 2번 피보나치 방법
//		int ppre = 100, curr;
//		int pre = sc.nextInt();
//		System.out.print(ppre + " " + pre + " ");
//
//		while (true) {
//			// 1. curr를 구하고, 출력한다.
//			curr = ppre - pre;
//			System.out.print(curr + " ");
//
//			// 2. curr가 음수이면 반복문을 벗어난다.
//			if (curr < 0)
//				break;
//
//			// 3. pre를 ppre에 복사한다
//			ppre = pre;
//			pre = curr;
//		}
	}
}

//100이하의 자연수를 입력받아 첫번째 항은 100으로 두 번째 항은 입력받은 수로 초기화 하고 
//다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지
//출력하는 프로그램을 작성하시오.

//입력
//62
//출력
//100 62 38 24 14 10 4 6 -2
