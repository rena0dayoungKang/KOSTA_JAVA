package chapter06;

public class Exam6_24 {

	static int abs(int data) {
		return data < 0 ? -data : data;
	}

	public static void main(String[] args) {

		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

}


//5의 절대값:5
//-10의 절대값:10