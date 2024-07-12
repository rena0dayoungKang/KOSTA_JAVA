package chapter05;

//5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고
//오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
public class ArrayTest7 {

	public static void main(String[] args) {

		// 버블 sort
		// 내생각
		int[] numbers = { 95, 75, 85, 100, 50 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				} else {
					continue;
				}
			}
		}


		// 선생님
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = 0; j < numbers.length - i - 1; j++) {
//				if (numbers[j] > numbers[j + 1]) {
//					int t = numbers[j];
//					numbers[j] = numbers[j+1];
//					numbers[j+1] = t;
//				}
//			}
//		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
