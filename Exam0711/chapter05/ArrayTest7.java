package chapter05;

//5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고
//오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
public class ArrayTest7 {

	public static void main(String[] args) {

		// 버블 sort
		int[] numbers = { 95, 75, 85, 100, 50 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				int tmp = 0;
				if (numbers[j] > numbers[j + 1]) {
					tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				} else {
					continue;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}

	}

}
