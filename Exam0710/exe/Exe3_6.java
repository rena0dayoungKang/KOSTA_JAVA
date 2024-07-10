package exe;
//아래 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 num의 값을 뺀 나머지를 구하는 코드이다. 
//예를들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다. 
//30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야한다. 

public class Exe3_6 {

	public static void main(String[] args) {
		int num = 20;
		
		int a = (num / 10 * 10) + 10;
		int b = a - num; 
		System.out.println(b);
		
		int r1 = (num / 10 + 1) * 10 -num;
		int r2 = 10 - num % 10;
		System.out.println(r1);
		System.out.println(r2);
		
		
	}

}
