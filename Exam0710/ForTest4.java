import java.util.Scanner;

//cnt가 4일 경우 
// a  1  2  3  4
// b  c  5  6  7
// d  e  f  8  9
// g  h  i  j  10

//cnt가 5일 경우 
// a  1  2  3  4  5
// b  c  6  7  8  9
// d  e  f  10 11 12
// g  h  i  j  13 14
// k  l  m  n  o  15

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		char alph = 'a';
		int number = 1;

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alph + j));
			}
			alph = (char) (++alph + i);

			for (int j = i; j < cnt; j++) {
				System.out.print(number++);
			}

			System.out.println();
		}

	}

}
