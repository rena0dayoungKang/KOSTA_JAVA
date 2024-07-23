package chapter09;

public class Exam9_4 {

	static void printGraph(int[] dataArr, char ch) {
		// (1) printGraph메서드를 작성하시오.
		for (int i = 0; i < dataArr.length; i++) {
			for (int j = 0; j < dataArr[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}
	}

	public static void main(String[] args) {

		printGraph(new int[] { 3, 7, 1, 4 }, '*');

	}
}

//***3
//*******7
//*1
//****4
