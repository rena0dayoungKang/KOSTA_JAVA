package chapter05;

import java.util.Scanner;

//2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
public class Jungol5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[2][4];
		int[][] arr2 = new int[2][4];

		//int[][] result = new int[2][4];
		// 출력 배열이 필요 할까?
		
		System.out.println("first array");
		//1. arr1
		for (int i = 0; i < arr1.length; i++) {
			String inputLine = sc.nextLine();
			String[] data = inputLine.split(" ");
			for (int j = 0; j < data.length; j++) {
				arr1[i][j] = Integer.parseInt(data[j]);
			}
		}
		
		System.out.println("second array");
		//2. arr2
		for (int i = 0; i < arr2.length; i++) {
			String inputLine = sc.nextLine();
			String[] data = inputLine.split(" ");
			for (int j = 0; j < data.length; j++) {
				arr2[i][j] = Integer.parseInt(data[j]);
			}
		}
		
		//3. 배열곱
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1.length; j++) {
//				result[i][j] = arr1[i][j] * arr2[i][j]; 
//			}
//		}
		
		//4. 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] * arr2[i][j]+" ");
			}
			System.out.println();
		}


	}

}

//first array
//1 2 3 4
//5 6 7 8
//second array
//1 4 7 8
//3 6 9 8
