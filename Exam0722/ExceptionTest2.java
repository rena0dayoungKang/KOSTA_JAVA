
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 20, 30, 40 };
		int[] arr2 = new int[] { 5, 0, 6, 8, 2 };
		int divSum = 0;
		
		
		// 1. for문을 빠져나가는 try catch
		try {
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(arr1[i] / arr2[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("종료");

		// 2. for문 안에서 try catch
		for (int i = 0; i < arr2.length; i++) {
//			try {
//				divSum += arr1[i] / arr2[i];
//				//System.out.println(arr1[i] / arr2[i]);
//			} catch (ArithmeticException e) {
//				//System.out.println(e.getMessage());
//			} catch (ArrayIndexOutOfBoundsException e) {
//				divSum += 1;
//				//System.out.println(e.getMessage());
//			}
			
			//3. ArithmeticException 등의 익셉션을 Exception 부모 클래스로 업캐스팅이 가능
			//프로그램이 죽지는 않지만 각각 예외처리를 할 때도 있고 이렇게 업캐스팅으로 한번에 하는 경우가 있다
			//그때그때 상황에 따라. 
			try {
				divSum += arr1[i] / arr2[i];
			} catch (Exception e) {
				divSum += 1;
			}
			
		}
		System.out.println("divSum: "+ divSum);
	}

}
