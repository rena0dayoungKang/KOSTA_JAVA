//Do~While문
package chapter04;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, sum = 0;
		
		do {
			input = sc.nextInt();
			sum += input;			
		} while(input != 0); 
		//사용자가 입력한 input값이 0이 아니라면 계속 반복 이라는 의미 
		
		System.out.println(sum);
	}

}
