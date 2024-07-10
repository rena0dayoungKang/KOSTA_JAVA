//3.연산자
public class OperatorTest {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		
		long c = a * b;
		System.out.println(c); //-1454759936
		long c2 = (long)(a*b);
		System.out.println(c2); //-1454759936
		long c3 = (long)a *b;
		System.out.println(c3); //2000000000000
		
		//논리연산
		//||는 앞에 것이 참이면 뒤에 것을 비교하지 않는다. 
//		String str = null;
//		if(str.length() == 0 || str == null) {
//			System.out.println("데이터가 없음");
//		}
//      str이 null일 때 평가하려고 하면 NullPointerException이 발생하기 때문에 참이나 거짓으로 판별할 수 없다. 
		
		String str2 = null;
		if(str2 == null || str2.length() == 0) {
			//앞 조건이 참이기 때문에 뒤에 조건을 판별하지 않음 
			System.out.println("데이터가 없음");
		}
		
		//&&는 앞 것이 거짓이면 뒤에 것을 비교하지 않는다. 
		int n = 10;
		if (n>5 && ++n>10) {
			System.out.println("");
		}
		System.out.println(n);
		int m = 10;
		if (m<5 && ++n>10) {
			System.out.println("");
		}
		System.out.println(m);
		
		//대입연산자 
		int k = 10;
		k *= 3+5;
		System.out.println(k);
		
	}

}
