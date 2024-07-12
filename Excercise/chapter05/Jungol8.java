package chapter05;

import java.util.Scanner;

//문제 
//학생들의 점수를 입력을 받다가 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여 
//점수대별 학생 수를 출력하는 프로그램을 작성하시오. (1명도 없는 점수는 출력하지 않는다.)
//학생은 최대 100명이하이다.
public class Jungol8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] scores = new int[100]; // 학생은 최대 100명
		int[] student = new int[10];

		// 1. 점수 입력, 10점대 단위로 나누쟈
		for (int i = 0; i < 100; i++) {
			scores[i] = sc.nextInt();
			if (scores[i] == 0) break;
			student[(scores[i] / 10) - 1]++;
		}
		
//		for(int i = 0; i < student.length; i++) {
//			System.out.print(student[i]);
//		}

		for (int i = student.length - 1; i >= 0; i--) {
			if (student[i] == 0) continue;
			System.out.println(String.format("%d : %d person\t", (i+1)*10, student[i]));
		}
	}

}

//63 80 95 100 46 64 88 0
//
//100 : 1 person
//90 : 1 person
//80 : 2 person
//60 : 2 person
//40 : 1 person