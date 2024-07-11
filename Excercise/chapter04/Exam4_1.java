package chapter04;

public class Exam4_1 {

	public static void main(String[] args) {
		// 1
		int x = 11;
		if (x > 10 && x < 20)
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(x > 10 && x < 20);

		// 2
		char ch = '\t';
		if (ch != ' ' && ch != '\t')
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(ch == ' ' || ch == 't');

		// 3
		char ch2 = 'x';
		if (ch2 == 'x' || ch2 == 'X')
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(ch2 == 'x' || ch2 == 'X');

		// 4
		char ch3 = 'a';
		if (ch3 >= '0' && ch3 <= '9')
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(ch3 >= '0' && ch3 <= '9');

		// 5
		char ch4 = 'a';
		if ((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z')) {
			System.out.println(true);
		} else
			System.out.println(false);
//		System.out.println(ch4 >= 'A' && ch4 <= 'Z' || ch4 <= 'a' && ch4 <= 'z');

		// 6 윤년 
		int y = 2024;
		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println((y%400==0 || y%4==0 && y%100!=0));
		

		// 7
		boolean powerOn = false;
		if (powerOn == false)
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(!powerOn);

		// 8
		String str = "no";
		if (str.equals("yes"))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
