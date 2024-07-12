package chapter05;

import java.util.Scanner;

public class Exam5_7 {

	public static void main(String[] args) {

		// (1-1)프로그램을 시작할 때 main에 파라미터를 가지고 올 수 있다. run configuration에서 적어서 받아오는방법
//		if (args.length != 1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}

		// (1-2)사용자로부터 돈을 입력받는 방법
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		System.out.println("money=" + money);

//		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//		int money = Integer.parseInt(args[0]);

		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오. 
			 * 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			 * 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
			 * 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */

			// 1.
			coinNum = money / coinUnit[i];

			// 2.
			if (coinNum > coin[i])
				coinNum = coin[i];
			coin[i] -= coinNum;

			// 3.
			money -= coinUnit[i] * coinNum;

			System.out.println(coinUnit[i] + "원 : " + coinNum);
		}

		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	}

}

// money : 3170
// 3170/500 = 6 500원 6개 줘야 하는데 5개뿐이다. min(6,5)=5, 500원 5개 빼면 3170-(500*5)=670 동전갯수 5-5=0
// 동전의 갯수를 갱신하는 것이 중요 
// 670/100 =6, min(6,5)=5, 670-(100*5) = 170, 5-5=0
// 170/50 = 3, min(3,5)=3, 170-(50*3) = 20, 5-5=0
// 20/10 = 2, min(2,5)=2, 20-(10*2) = 0, 5-5=0
