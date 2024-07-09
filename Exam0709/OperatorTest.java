//3. 연산자 
public class OperatorTest {

	public static void main(String[] args) {
		int n = 10, m = 20;
		int a = 10, b = 20;
		int r = a+b; //더하기 연산 이 대입연산 보다 우선순위
		
		//증감연산자 
		int rn = n++; 
		System.out.println(rn);
		System.out.println(n);
		
		int rm = ++m;
		System.out.println(rm);
		System.out.println(m);
		
		int t = 101, z = 201;
		System.out.println(t++);
		System.out.println(++z);
		
		byte b2 = 10;
		//byte br = b2 + 1; 
		//byte + int -> int + int = int를 byte로 넣으려면 에러
		byte br = (byte)(b2 + 1);
		
		short s = 20;
		//short sr = b2 + s;
		//byte + short -> int
		int sr = b2 + s;
		
		double dd = 10/4;
		double ddd = 10/4.0;
		//정수 나누기 정수는 정수가 된다. 
		System.out.println(dd);
		System.out.println(ddd);
		
		
	}

}
