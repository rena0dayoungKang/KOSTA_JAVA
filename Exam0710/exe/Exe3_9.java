package exe;
//다음은 문자형 변수 ch가 영문자(대문자 또는 소문자) 이거나 숫자일 때만 
//변수 b의 값이 true가 되도록 하는 코드이다. 
public class Exe3_9 {

	public static void main(String[] args) {
		char ch = '9';
		boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >=  '0' && ch <= '9' );
		System.out.println(b);
		
		char ch2 = 'T';
		char ch3 = (char)(ch2 + ('a'-'A'));
		System.out.println(ch3);
		
		
		char ch4 = 't';
		char ch5 = (char)(ch4 + ('A'-'a'));
		System.out.println(ch5);
	}

}
