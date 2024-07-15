//재귀함수와 지역변수
public class RecursiveCallTest {

	public static int factorial(int n) {
		// 파라미터 인자값은 지역변수로 함수 내에서 사용하고 없어짐
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		//(1)함수호출
//		int result = factorial(5);
//		System.out.println(result);

		
		//(2)반복문 사용 
		int result = 1;
		for (int i = 5; i > 1; i--) {
			result *= i;
		}
		
		System.out.println(result);
		//함수호출 보다 반복문 사용이 메모리 관리 차원에서는 더 좋다. 
		//그렇지만 지금은 하드웨어가 엄청 좋아졌기 때문에 더 적절한 것을 쓰는게 좋다. 

	}

}
