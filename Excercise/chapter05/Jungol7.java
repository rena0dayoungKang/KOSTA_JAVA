package chapter05;

//가람이는 주사위 놀이를 하다가 주사위 
import java.util.Scanner;

public class Jungol7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[6];

		for (int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			cnt[number-1]++;   //-1을 안하려면 cnt[] 를 7개 자리로 해야함 
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.print(String.format("%d : %d\n", (i+1), cnt[i]));
		}

	}

}
