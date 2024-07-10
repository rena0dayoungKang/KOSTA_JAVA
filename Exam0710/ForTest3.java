import java.util.Scanner;
//(1)ok
//*******
//*******
//*******
//*******
//*******
//*******
//*******

//(2)ok
//cnt=5, i(행), j(열)
//*      0     0
//**     1     1
//***    2     2
//****   3     3
//*****  4     4

//(3) ok
//cnt=5
//*****
//****
//***
//**
//*

//(4) ok
//cnt=5    i    sp   st
//*****    0    0    5
// ****    1    1    4
//  ***    2    2    3
//   **    3    3    2
//    *    4    4    1


//(5)ok
//cnt=5      i   sp  st
//    *      0   4    1
//   ***     1   3    3
//  *****    2   2    5
// *******   3   1    7
//*********  4   0    9
//sp: cnt-i-1
//st: 2*i+1

public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		//(1)
//		for(int i=0; i<cnt; i++) {
//			for(int j=0; j<cnt; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//(2)
//		for(int i=0; i<cnt; i++) {
//			for(int j=0; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//(3)
//		for (int i=0; i<cnt; i++) {
//			for(int j=cnt-1; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//(4)
//		for (int i=0; i<cnt; i++) {
//			for (int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for (int j=0; j<cnt-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//(5)
		for (int i=0, st=1; i<cnt; i++, st+=2) {
			for (int j=0; j<cnt-i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<st; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


