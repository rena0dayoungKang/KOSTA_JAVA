package chapter05;

public class ArrayTest {

	public static void main(String[] args) {
		int[] narr = new int[5];
		//heap영역에 생성된 변수는 자동으로 0으로 초기화.
		narr[0] = 10; // 배열로 선언되는 것은 index를 붙여야 int
		narr[1] = 20;
		narr[2] = 30;
		narr[3] = 40;
		narr[4] = 50;
		// narr[5] = 60; ArrayIndexOutOfBounds. 0부터 4까지 사용

		for (int i = 0; i < narr.length; i++) { // 배열의 갯수를 반환, 괄호없음
			System.out.println(narr[i]); // 무조건 배열은0번부터 채워짐
		}

		int n = 100;
		int m;
		m = 200;
		
		double[] darr; //배열명 선언
		darr = new double[3]; //배열 객체 생성 & 배열명에 할당 
		
		int[] narr2 = new int[] {1,2,3,4,5}; //배열명 선언과 객체생성, 초기화1
		int[] narr3 = {1,2,3,4,5}; //heap영역에 객체 생성과 동일한 의미, 초기화2

		int[] narr4;
		narr4 = new int[] {1,2,3,4,5};
		
		int[] narr5; 
		//배열명과 객체를 따로 생성할 때는 
		//narr5 = {1,2,3,4,5}; new int[] 를 생략할 수 없다. 
		
		
	}
}
