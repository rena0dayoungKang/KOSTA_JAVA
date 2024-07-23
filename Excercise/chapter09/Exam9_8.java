package chapter09;

public class Exam9_8 {

	// (1) round메서드를 작성하시오.
	public static double round(double d, int n) {
		return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));

	}

}

//3.1
//3.14
//3.142
//3.1415
//3.1415