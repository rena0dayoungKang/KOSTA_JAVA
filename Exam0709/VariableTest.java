//2. 변수
public class VariableTest {

	public static void main(String[] args) {
		int age = 30;	
		//변수가 = 의 왼쪽에 올 경우는 변수에 = 오른쪽 값을 할당하는 것이다. 
		System.out.println(age);
		//그 이외는 변수에 저장된 값을 활용하는 것. 
		age = 40;
		//변수는 변하는 수 라서 새로운 값을 넣으면 바뀐다. 
		System.out.println(age);
		
		final double PI = 3.14;
		//final 변수는 대문자로 선언한다. 
		System.out.println(PI);
		//PI = 3.1415; //final 변수는 변경 불가 
		
		char ch = '홍';
		//char 는 반드시 작은 따옴표에 한 글자만 들어간다. 
		System.out.println(ch);
		
		String name = "홍길동";
		//String 형태는 한 글자 이상 들어가고 반드시 큰 따옴표를 사용한다.
		System.out.println(name);
		
		float height = 175.3f;
		//숫자 뒤에 F(or f)를 추가하면 float데이터를 의미한다. 리터럴
		System.out.println(height);

		double weight = 86.4;
		double weight2 = 86.4d;
		//d를 생략해도 되고 안해도 됨
		System.out.println(weight);
		System.out.println(weight2);
		
		long lv = 1000000000000000000L; 
		//숫자 뒤에 L추가 해주어서 long 데이터타입 리터럴 명시 
		System.out.println(lv);
		
		boolean married = true;
		System.out.println(married);
		//자바는 논리 타입에 true, false 넣고 C언어는 1이나 0
		
		int oct = 0100; 
		//숫자 앞에 0 이 있으면 8진수 
		//2진수는 엄청 길기 때문에, 8진수로 16진수로 보고자 할 때 사용 
		System.out.println(oct);
		
		int hex = 0x100;
		//숫자 앞에 0x가 있으면 16진수 
		System.out.println(hex);
		
		int n;
		//System.out.println(n); error
		//지역변수는 초기화하지 않고 사용하면 에러가 난다. 
		
		char ch2 = ' ';
		//char 변수는 따옴표만으로 초기화할 수 없다. 
		int ch3 = (int)ch2;
		System.out.println(ch3); //ch2를 아스키코드(10진수)로 변환한 값 
		
		String str = "";
		//String변수는 큰 따옴표만으로 초기화 할 수 있다. 
		System.out.println(str);
		
		String str2 = "abc"+"def";
		//문자열은 어떤 타입과 + 연산을 하면 문자열로 변환된다. 
		//문자열 + 문자열 은 문자열을 합쳐준다. 
		System.out.println(str2);
		
		String str3 = "abc"+123;
		//문자열 + 정수 로 하면 정수가 문자열 형태로 바뀌고 문자열합침
		System.out.println(str3);
		
		String str4 = "7"+7+7;
		//연산은 왼쪽부터 수행하기 때문에 모두 문자열 취급 
		System.out.println(str4);
		
		String str5 = 7+7+"7";
		//정수 더하기 연산 후, 문자열 합침 
		System.out.println(str5);
		
		byte b = 127;
		System.out.println(b);
		b++;
		System.out.println(b);
		//byte 형태의 overflow 현상
		
		byte b2 = 10;
		int n2 = b2; //자동 타입캐스팅 byte to int
		byte b3 = (byte)n2; //타입캐스팅 int to byte 
	}

}
