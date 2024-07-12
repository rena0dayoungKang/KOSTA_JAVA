package chapter05;

import java.util.Scanner;

//10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 
//출력하는 프로그램을 작성하시오. 평균은 반올림하여 소수첫째자리까지 출력한다.
public class Jungol4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Long[] numbers = new Long[10];

//		int sum = 0;
//		double avg = 0.0;
//
//		for (int i = 0; i < 10; i++) {
//			numbers[i] = sc.nextLong();
//			if (i % 2 == 0) { //홀수번째
//			} else { //짝수번째
//				sum += numbers[i];
//			}
//		}

		int[] num = new int[10];
		int odd = 0, even = 0; // 홀수odd 짝수even
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (i % 2 == 0) {	//홀수번째 숫자를 의미
				odd += num[i];
			} else {			//짝수번째 숫자를 의미
				even += num[i];
			}
		}
		
		System.out.println("sum : " + even);
//		System.out.println(odd/(double)(num.length/2));
//		System.out.println(Math.round(odd/(double)(num.length/2)*10/10));
		System.out.println("avg : " + Math.round((odd/(double)(num.length/2))*10)/10d);

	}

}
